package secao_tres.entrada_de_dados.exemplo;

import java.util.Scanner;

public class helloWorld {

    public static void main(String[] args){

        /*
        Entrada de dados é quando o utilizador informa dados para o programa
        (que no caso vai ser dentro das variáveis).

        Para fazer isso, o utilizador ele utiliza o dispositivo de entrada que seria no caso o teclado que a gente utiliza..

        E chamamos isso de LEITURA = o programa está a ler dados.
         */

        Scanner sc = new Scanner(System.in); // é a entrada especial padrão do teclado, mas utilizando JAVA para fazer a entrada de dados

        sc.close(); // é quando vai deslocar o recurso que criamos
    }
}
