/*
 * O programa recebe um número inteiro e determina se ele é um número primo
 */
package Lista3;

import java.util.Scanner;

public class Primo {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        
        int numb;
        boolean resposta = true;
        
        System.out.println("O número é primo?");
        System.out.print("Digite o número: ");
        numb = entrada.nextInt();
        for (int i = 2; i < numb; i++){
            if(numb%i == 0){
                resposta = false;
            }
        }
        
        if(resposta){
           System.out.println("Sim, o número é primo.");
        }
        else{
           System.out.println("Não, o número não é primo.");
        }
    }
}
