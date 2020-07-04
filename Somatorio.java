/*
 * O programa calcula o somatório de 10 números recebidos do teclado.
 */
package Lista3;

import java.util.Scanner;

public class Somatorio {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int soma = 0;
        
        for(int cont = 0; cont < 10; cont++){
            System.out.print("Digite um número: ");
            int a = entrada.nextInt();
            soma += a;    
        }
        
        System.out.println("A soma dos números inseridos é: " + soma);
    }
}
