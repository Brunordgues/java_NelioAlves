package secao_cinco.URI;

import java.util.Scanner;

public class URI_1078 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i=1; i<=10; i++){
            int produto = i * N;
            System.out.println(i + " X " + N + " = " + produto);
        }

        sc.close();
    }
}

/*

Leia 1 valor inteiro N(2<N<1000). A seguir, mostre a tabuada de N:
 1 x N = N | 2 X N = 10N

 ENTRADA:
 A ENTRADA CONTÉM UM VALOR INTEIRO N (2<N<1000)

 SAIDA
 IMPRIMA A TABUADA DE N, CONFORME O EXEMPLO FORNECIDO
 */