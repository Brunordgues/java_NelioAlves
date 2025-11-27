package secao_tres.entrada_de_dados.exemplo;

import java.util.Locale;
import java.util.Scanner;

/*
Para ler um número com ponto flutuante

suponha uma variável tipo double declarada:

double x


ATENCIONE:

para considerar o separador do decimais como ponto, ANTES da declaração do Scanner, faça:

locale.setDefault(Locale.US);
 */

public class entrada_de_dados_ex_3 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        //estou associando o meu objeto Scanner sc ao teclado no modo console
        Scanner sc = new Scanner(System.in);

        //permite que vamos digitar uma palavra para ser armazenada dentro da variável X
        double x;
        x = sc.nextDouble();
        System.out.printf("Você digitou: %.2f%n", x);

        sc.close(); //encerramento
    }
}
