/*
 * O programa recebe 10 números do teclado e imprime o maior deles.
 */
package Lista3;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        //Declarar as variáveis
        int maior;
        int numb;
        
        //Inicializar as variáveis através do input do usuário
        System.out.print("Digite um número: ");
        numb = entrada.nextInt();
        maior = numb;
        
        //Solicitar input do usuário dos próximos números
        //Realizar teste se o número inserido é maior ou não
        for (int cont=1 ; cont < 10 ; cont++){
            System.out.print("Digite outro número: ");
            numb = entrada.nextInt();
            if (numb > maior){
                maior = numb;
            }
        }
        
        //Imprimir resultado do maior número
        System.out.println("O maior número digitado foi: " + maior);
    }
}
