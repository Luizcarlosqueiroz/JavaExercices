/*
 * O programa recebe os tempos de 10 corredores de uma maratona
 * e imprime na tela o tempo médio da prova, considerando os 10 atletas,
 * e o melhor e o pior tempo obtido.
 */
package Lista3;

import java.util.Scanner;

public class Maratona {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Maratona UNICAP!");
        
        //Declarar e inializar as variáveis 
        int melhor = 0;
        int melhorCorredor = 0;
        int pior = 0;
        int piorCorredor = 0;
        int soma = 0;
        int corredor;
        
        for (int cont = 1; cont <= 10; cont++){
            System.out.print("Digite o tempo do corredor "+cont+" em min: ");
            corredor = entrada.nextInt();
            
            //Soma para cálculo do tempo médio
            soma += corredor;
            
            //Melhor e pior tempo
            if (cont == 1){
                melhor = corredor;
                pior = corredor;
                melhorCorredor = cont;
                piorCorredor = cont;
            }
            else{
                if(corredor > pior){
                    pior = corredor;
                    piorCorredor = cont;
                }
                if(corredor < melhor){
                    melhor = corredor;
                    melhorCorredor = cont;
                }
            }
            
        }
        
        System.out.println("===== RESULTADOS =====");
        System.out.println("O tempo médio dos corredores foi: " + (soma/10));
        System.out.println("O pior tempo foi do corredor "+ piorCorredor +
                ", com o tempo de "+pior);
        System.out.println("O melhor tempo foi do corredor "+ melhorCorredor +
                ", com o tempo de "+melhor);
        
    }
}
