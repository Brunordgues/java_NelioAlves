package secao_tres.exercicio_resolvido;

import java.util.Locale;
import java.util.Scanner;

public class atv_3 {

    /*

    Fazer um programa para ler o nome (apenas uma palavra) e idade de duas pessoas.
    Ao final mostrar uma mensagem com os nomes e a idade média entre essas pessoas,
    com uma casa decima, conforme exemplo

    entrada:
    Maria 19
    Joaquim 20

    Saida:
    A idade média de Maria e Joaquim é de 19.5 anos

     */

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome1 = sc.next();
        int idade1 = sc.nextInt();

        String nome2 = sc.next();
        int idade2 = sc.nextInt();

        double media = (idade1 + idade2) / 2.0;

        // podemos utilizar double media = (double) (idade1 + idade2) / 2.0;

        System.out.printf("A idade média de %s e %s é de %.1f anos", nome1, nome2, media);

        sc.close();



    }
}
