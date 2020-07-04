/*
 * O programa recebe 10 números do teclado e imprime o menor deles.
 */
package Lista3;

import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int menor;
        int usuario;
        
        System.out.print("Digite um número: ");
        usuario = entrada.nextInt();
        menor = usuario;
        
        for (int cont = 1; cont < 10; cont++){
            System.out.print("Digite outro número: ");
            usuario = entrada.nextInt();
            if(usuario < menor){
                menor = usuario;
            }
        }
        
        System.out.println("O menor número digitado foi: " + menor);
    }
}
