package secao_tres.entrada_de_dados.exemplo;

import java.util.Scanner;

public class entrada_de_dados_ex_1 {

    public static void main(String[] args){

        //estou associando o meu objeto Scanner sc ao teclado no modo console
        Scanner sc = new Scanner(System.in);

        //permite que vamos digitar uma palavra para ser armazenada dentro da variável X
        String x;
        x = sc.next();
        System.out.println("Você digitou: " + x);



        sc.close(); //encerramento
    }
}
