/*
 * O programa imprime todos os números de 1 até 
 * um dado número escolhido pelo usuário.
 */
package Lista3;

import java.util.Scanner;

public class UmAteN {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner (System.in);
       
        //Solicitar ao usuário o número de parada
        System.out.print("Digite um número: ");
        int a = entrada.nextInt();
        
        //Iniciar o número a ser impresso, condicionando-o ao número de parada
        for (int p = 1; p <= a; p++)
        {
            System.out.println(p);
        }
        
    }
}
