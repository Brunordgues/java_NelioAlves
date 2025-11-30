package secao_tres.URI;

import java.util.Scanner;

public class URI_1003 {

    public static void main(String[] args){

        int A, B, soma;

        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();

        soma = A + B;

        System.out.println("SOMA = " + soma);

        sc.close();

    }
}
