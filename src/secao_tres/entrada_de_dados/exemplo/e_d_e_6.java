package secao_tres.entrada_de_dados.exemplo;

import java.util.Locale;
import java.util.Scanner;

/*

Para ler um texto ATÉ A QUEBRA DE LINHA

ATENCIONE:

QUEBRA DE LINHA PENDENTE

QUANDO VOCÊ USA UM COMANDO DE LEITURA DIFERENTE DO NEXTLINE() E DÁ
ALGUMA QUEBRA DE LINHA, ESSA QUEBRA DE LINHA FICA "PENDENTE" NA ENTRADA PADRÃO

SE VOCÊ ENTÃO FIZER UM NEXTLINE(),
AQUELA QUEBRA DE LINHA PENDENTE SERÁ ABSORVIDA PELO NEXTLINE().

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        //estou associando o meu objeto Scanner sc ao teclado no modo console
        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;

        x = sc.nextInt();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();


        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close(); //encerramento
    }

    SOLUÇÃO:

    FAÇA UM NEXTLINE() EXTRA ANTES DE FAZER O NEXTLINE() DE SEU INTERESSE

        public static void main(String[] args){

        Locale.setDefault(Locale.US);

        //estou associando o meu objeto Scanner sc ao teclado no modo console
        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;

        x = sc.nextInt();
        Sc.nextLine(); ------------------------------------- está sozinho
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();


        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close(); //encerramento
    }
 */

public class e_d_e_6 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        //estou associando o meu objeto Scanner sc ao teclado no modo console
        Scanner sc = new Scanner(System.in);

        String s1, s2, s3;

        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();


        System.out.println("Dados digitados: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close(); //encerramento
    }
}
