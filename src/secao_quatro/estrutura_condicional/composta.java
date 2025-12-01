package secao_quatro.estrutura_condicional;

import java.util.Scanner;

public class composta {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int hora;

        System.out.println("Quantas horas?");
        hora = sc.nextInt();

        if (hora < 12){
            System.out.println("Bom dia né meu anjo");
        }

        else{
            System.out.println("Boa Tarde né meu anjo");
        }

        sc.close();

        /*

        REGRA
        V: executa somente o bloco do if
        F: executa somente o bloco do else

         */
    }
}
