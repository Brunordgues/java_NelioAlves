package secao_quatro.resolvidos;


import java.util.Locale;
import java.util.Scanner;

public class atv_2 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double delta = b * b - 4.0 * a * c;
        if (a == 0 || delta < 0.0) {
            System.out.println("Impossivel calcular");
        }
        else {
            double r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
            System.out.printf("R1 = %.5f%n", r1);
            System.out.printf("R2 = %.5f%n", r2);
        }
        sc.close();
    }
}

/*

Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara.
Se não for possível calcular as raízes, mostre a mensagem correspondente "Impossível Calcular",
caso haja uma divisão por 0 ou raiz de número negativo

ENTRADA:
Leia três valores de ponto flutuante (double) A, B e C.

SAÍDA:
se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossível calcular".
Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente
conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem

EXEMPLOS DE ENTRADA:
10.0
20.1
5.1

EXEMPLOS DE SAÍDA:
R1 = -0.29788
R2 = -1.71212

------------------

ENTRADA:
0.0
20.0
5.0

EXEMPLOS DE SAÍDA:
Impossivel calcular

--------------------
EXEMPLOS DE ENTRADA:
10.3
203.0
5.0

SAIDA:
R1 = -0.02466
R2 = -19.68408

------------------

EXEMPLOS DE ENTRADA:
10.0
3.0
5.0

SAIDA:
Impossível calcular

 */