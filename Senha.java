/*
 * O programa simula um cofre que possui uma senha numérica para ser aberto.
 * O usário deve digitar a senha 1031 para abri-lo.
 * Caso erre, o programa pergunta se deseja continuar, e informa se a senha 
 * correta é maior ou menor que a tentativa.
 */
package Lista3;

import java.util.Scanner;

/**
 *
 * @author Luiz Carlos
 */
public class Senha {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        
        char cont = 'S';
        int senha;
        
        while (cont == 'S'){
            System.out.print("Digite a senha: ");
            senha = entrada.nextInt();
            if(senha == 1031){
                System.out.println("Senha correta!");
                System.out.println("Cofre desbloqueado.");
                break;
            }
            else{
                System.out.print("Senha Incorreta! ");
                if(senha > 1031){
                    System.out.println("A senha correta é menor.");
                }
                else if(senha < 1031){
                    System.out.println("A senha correta é maior.");
                }
                System.out.print("Deseja tentar novamente? [S/N] ");
                cont = entrada.next().charAt(0);
            }
        }
    }
}
