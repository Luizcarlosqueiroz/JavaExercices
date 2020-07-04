/*
 * O programa realiza a apuração de votos de uma eleição.
 */
package Lista3;

import java.util.Scanner;

public class Eleicao {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        //Texto inicial
        System.out.println("Eleições!!!");
        System.out.println("Você poderá votar nos candidatos 1, 2 e 3.");
        System.out.println("==========================================");
        
        //Declaração e inicialização de variáveis
        int candA = 0;
        int candB = 0;
        int candC = 0;
        int soma;
        int voto;
        char continuar;
        
        //Computação de votos
        //Este loop faz com que o usuário informe se haverão mais votos ou não
        do{
            
            //Este loop garante que o usuário colocará um voto válido
            do{
                System.out.print("Digite seu voto: ");
                voto = entrada.nextInt();

                //Computação do voto em cada candidato
                switch(voto){
                    case 1:
                        candA += 1;
                        break;
                    case 2:
                        candB += 1;
                        break;
                    case 3:
                        candC += 1;
                        break;
                    default:
                        System.out.println("Voto Inválido!");
                }
            }while (voto != 1 && voto != 2 && voto != 3);
            
            System.out.print("Deseja inserir outro voto? [S/N] ");
            continuar = Character.toUpperCase(entrada.next().charAt(0));
            
        }while(continuar == 'S');
        
        soma = candA + candB + candC;
        
        //Apuração dos resultados de cada candidato
        double candAPer = ((double)candA / soma)*100;
        double candBPer = ((double)candB / soma)*100;
        double candCPer = ((double)candC / soma)*100;
        
        System.out.println("==========================================");
        System.out.println("Apuração dos votos....");
        System.out.println("Total de votos: " + soma);
        System.out.printf("Candidato 1: %.1f \n", candAPer);
        System.out.printf("Candidato 2: %.1f \n", candBPer);
        System.out.printf("Candidato 3: %.1f \n", candCPer);
        System.out.println("==========================================");
        
        
        //Primeiro turno ou Segundo Turno?
        boolean segTurno = true;
        
        //Primeiro turno
        if(candAPer > 50){
            segTurno = false;
            System.out.println("Vencedor no primeiro turno: Candidato 1.");
        }
        else if(candBPer > 50){
            segTurno = false;
            System.out.println("Vencedor no primeiro turno: Candidato 2;");
        }
        else if(candCPer > 50){
            segTurno = false;
            System.out.println("Vencedor no primeiro turno: Candidato 3;");
        }
        
        //Segundo Turno
        if(segTurno){
            System.out.print("Segundo turno entre: ");
            
            if(candA < candB && candA < candC){
                System.out.println("2 e 3");
            }
            else if(candB < candA && candB < candC){
                System.out.println("1 e 3");
            }
            else if(candC < candA && candC < candB){
                System.out.println("1 e 2");
            }
            else{
                System.out.println("Empate técnico");
            }
        }
    }
}
