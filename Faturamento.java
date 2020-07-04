/*
 * O programa recebe os resultados diários de venda de dois produtos,
 * e realiza algumas análises de venda e faturamento.
 */
package ListaEspecial2;

import java.util.Scanner;

public class Faturamento {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
  
        int qtdCoxinha;
        int qtdPastel;
        int qtdTotalCoxinha = 0;
        int qtdTotalPastel = 0;
        
        double diaFaturamento;
        double mesCoxinhaFaturamento;
        double mesPastelFaturamento;
        double maiorFaturamento = 0;
        double menorFaturamento = 0;
        double mesFaturamento;
        
        int diaMaiorFaturamento = 0;
        int diaMenorFaturamento = 0;
        

        System.out.println("Olá, Lanchonete Unicap!");
        System.out.println("Vamos calcular os resultados do mês. \n");
        
        for (int dias = 1; dias <= 5 ; dias++){          
            System.out.println("DIA " + dias);
            
            //Receber quantidade de coxinhas do respectivo dia (até 500)
            do {
                System.out.print("Neste dia foram vendidas quantas coxinhas? ");
                qtdCoxinha = entrada.nextInt();
                
                if(qtdCoxinha > 500){
                    System.out.println("Quantidade maior que o estoque. Favor conferir.");
                }
            }while(qtdCoxinha > 500);
            
            //Receber quantidade de pastéis do respectivo dia (até 500)
            do{
                System.out.print("Neste dia foram vendidos quantos pasteis? ");
                qtdPastel = entrada.nextInt();
                
                if(qtdPastel > 500){
                    System.out.println("Quantidade maior que o estoque. Favor conferir.");
                }
            }while(qtdPastel > 500);
            
            //Faturamento diário
            diaFaturamento = (qtdCoxinha * 4.50) + (qtdPastel * 4.00);
            
            //Analisar se o dia teve o maior ou menor faturamento
            if(dias == 1){
                maiorFaturamento = diaFaturamento;
                menorFaturamento = diaFaturamento;
                diaMaiorFaturamento = dias;
                diaMenorFaturamento = dias;
            }
            else{
                //Maior faturamento
                if (diaFaturamento > maiorFaturamento){
                    maiorFaturamento = diaFaturamento;
                    diaMaiorFaturamento = dias;
                }
                //Menor faturamento
                else if (diaFaturamento < menorFaturamento){
                    menorFaturamento = diaFaturamento;
                    diaMenorFaturamento = dias;
                }
            }
            
            //Adicionar a quantidade do dia ao total
            qtdTotalCoxinha += qtdCoxinha;
            qtdTotalPastel += qtdPastel;
            
        }
        
        //Calculos adicionais
        mesCoxinhaFaturamento = qtdTotalCoxinha * 4.50;
        mesPastelFaturamento = qtdTotalPastel * 4.00;
        mesFaturamento = mesCoxinhaFaturamento + mesPastelFaturamento;
        
        
        //Imprimir resultados
        System.out.println("\n ======= RESULTADOS ======= \n");
        
        //Faturamento total dos 30 dias 
        System.out.printf("1) Faturamento Total (mês): R$ %.2f.\n", mesFaturamento);
        
        //Maior faturamento registrado em um dia
        System.out.printf("2) Maior Faturamento Diário: R$ %.2f no dia %d.\n", maiorFaturamento, diaMaiorFaturamento);
        
        //Menor faturamento registrado em um dia
        System.out.printf("3) Menor Faturamento Diário: R$ %.2f no dia %d.\n", menorFaturamento, diaMenorFaturamento);
        
        //O nome do produto com maior faturamento
        System.out.print("4) Produto com maior faturamento mensal (R$): ");
        if (mesCoxinhaFaturamento > mesPastelFaturamento){
            System.out.printf("Coxinha (R$ %.2f). \n", mesCoxinhaFaturamento);
        }
        else if (mesCoxinhaFaturamento < mesPastelFaturamento){
            System.out.printf("Pastel (R$ %.2f). \n", mesPastelFaturamento);
        }
        else if (mesCoxinhaFaturamento == mesPastelFaturamento){
            System.out.printf("Empate (R$ %.2f). \n", mesCoxinhaFaturamento);
        }
        
    }
}
