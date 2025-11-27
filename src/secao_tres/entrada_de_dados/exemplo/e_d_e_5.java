package secao_tres.entrada_de_dados.exemplo;

import java.util.Locale;
import java.util.Scanner;

/*

Como eu faço para ler vários dados na mesma linha

string x;
int y;
double z;

 */

public class e_d_e_5 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        //estou associando o meu objeto Scanner sc ao teclado no modo console
        Scanner sc = new Scanner(System.in);


        String x;
        int y;
        double z;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();


        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close(); //encerramento
    }
}
