package secao_tres.entrada_de_dados.exemplo;

import java.util.Scanner;

public class entrada_de_dados_ex_2 {

    public static void main(String[] args){

        /*
        Para ler um número inteiro
        Suponha uma variável tipo int declarada

        int x;
         */

        Scanner sc = new Scanner(System.in);

        int x;
        x = sc.nextInt();
        System.out.println("Voce digitou: " + x);

        sc.close();
    }
}
