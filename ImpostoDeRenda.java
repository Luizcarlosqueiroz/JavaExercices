/*
 * O programa realiza o cálculo do IR a ser pago por uma pessoa,
 * considerando sua faixa salarial.
 */
package Lista2;

import java.util.Scanner;

public class ImpostoDeRenda {
    public static void main(String[] args){
        Scanner read = new Scanner (System.in);       
        
        //Declarar variáveis
        double salarioBruto, deducoes, salarioBase;
        double f2, f3, f4, f5;
        double IR;
        
        //Inicializar variáveis da faixa de IR
        f2 = 0;
        f3 = 0;
        f4 = 0;
        f5 = 0;
        
        //Solicitar entrada do usuário do salarioBruto e deduções
        System.out.println("Vamos calcular o IRPF.");
        System.out.print("Digite o saláiro bruto: R$");
        salarioBruto = read.nextDouble();
        System.out.print("Digite as deduções: R$");
        deducoes = read.nextDouble();
        
        //Calcular qual o salarioBase para cálculo
        salarioBase = salarioBruto - deducoes;
        
        //Calcular quanto será pago para cada faixa do salário
        if (salarioBase > 4463.81){
            f5 = salarioBase - 4463.81;
        }
        if (salarioBase > 3572.43){
            f4 = salarioBase - f5 - 3572.43;
        }
        if (salarioBase > 2679.29){
            f3 = salarioBase - f5 - f4 - 2679.29;
        }
        if (salarioBase > 1787.77){
            f2 = salarioBase - f5 - f4 - f3 - 1787.77;
        }
        
        //Cálculo do total a ser pago
        //considerando o valor absoluto de cada faixa
        IR = (f2*0.075) + (f3*0.15) + (f4*0.225) + (f5*0.275);
        
        //Imprimir resultados
        System.out.println("========================");
        if (salarioBase < 1787.77){
            System.out.println("Você é isento do pagamento de importo de renda");
        }
        else{
            System.out.printf("Você pagará R$ %.2f", IR);
        }
    }
}
