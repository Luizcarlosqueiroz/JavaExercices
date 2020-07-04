/*
 * O programa executa os cálculos da área de certas figuras geométricas.
 */
package Lista3;

import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.lang.*;

/**
 *
 * @author Luiz Carlos
 */
public class CalculadoraGeo {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Calculadora de figuras geométricas.");
        
        int opcao;
        char continuar = 'S'; 
        double area = 0;
                
        
        while (continuar == 'S'){       
            System.out.print("Qual figura será calculada? \n"
                    + "[1] Quadrado \n"
                    + "[2] Triângulo \n"
                    + "[3] Círculo \n"
                    + "Qual a opção desejada? ");
            opcao = entrada.nextInt();

            switch(opcao){
                case 1:
                    System.out.print("Qual o lado do quadrado? ");
                    int lado = entrada.nextInt();
                    area = lado * lado;
                    break;
                case 2:
                    System.out.print("Qual a base do triângulo? ");
                    int base = entrada.nextInt();
                    System.out.print("Qual a altura do triângulo? ");
                    int altura = entrada.nextInt();
                    area = (base*altura)/2;
                    break;
                case 3:
                    System.out.print("Qual o raio do círculo? ");
                    int raio = entrada.nextInt();
                    area = Math.PI * pow(raio, 2);
                    break;
                default:
                    System.out.println("Você nao digitou uma entrada válida.");
            }
            
            if (opcao == 1 || opcao == 2 || opcao == 3){
                System.out.printf("A área é igual a %.2f \n", area);
            }
                       
            
            System.out.print("Deseja continuar [S/N]? ");
            continuar = Character.toUpperCase(entrada.next().charAt(0));
        
        }
        
        System.out.println("Você finalizou o programa. Até breve.");
    }
}
