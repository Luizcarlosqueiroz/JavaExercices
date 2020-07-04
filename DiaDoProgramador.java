/*
 * O programa determina, dado o ano inforamdo pelo usuário, qual será a data
 * do dia do programador, o 256º dia do ano.
 */
package ListaEspecial2;

import java.util.Scanner;

public class DiaDoProgramador {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int ano;
        boolean bisexto = false;
        
        
        //Mensagem inicial e input do usuário
        System.out.println("Olá, programador! \n"
                + "Em qual data vamos comemorar nosso dia este ano? \n"
                + "Digite o ano a ser analisado: " );
        ano = entrada.nextInt();
        
        
        //Regra 1: o ano é divisível por 4 e não divisível por 100
        if ( ano%4 == 0 && ( ano%100 != 0)){
            bisexto = true;
        }   
        //Regra 2: o número não é multiplo de 100, mas é multiplo de 400
        if (ano%400 == 0){
            bisexto = true;
        }
        
        //Imprimir resultado
        if(bisexto){
            System.out.println("Este ano é bisxeto, logo o dia do programador será 12 de setembro.");
        }
        else{
            System.out.println("Este ano não é bisexto, logo o dia do programador será 13 de setembro.");
        }
        
    }
}
