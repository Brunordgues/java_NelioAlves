package secao_quatro.operadores_de_atribuicao_cumalativa;

import java.util.Locale;
import java.util.Scanner;

/*

Problema exemplo

Uma operadora de telefonia cobra R$50.00 por um plano básico que dá direito a 100 minutos de telefone.
Cada minuto que exceder a franquia de 100 minutos custa R$2.00.
Fazer um programa para ler a quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.

 */

public class atribuicao_cumulativa {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        // Criação do objeto Scanner para ler dados do teclado
        Scanner sc = new Scanner(System.in);

        // Lê a quantidade de minutos consumidos pelo usuário
        int minutos = sc.nextInt();

        // Valor inicial da conta é o valor fixo do plano básico
        double conta = 50.0;

        // Se o usuário excedeu os 100 minutos da franquia...
        if(minutos > 100){
            // Calcula o valor adicional: (minutos excedentes) * R$2.00, e soma ao valor base
            conta = conta + (minutos - 100) * 2.0;

            // Alternativamente, poderia ser: conta += (minutos - 100) * 2.0;
            // O operador "+=" é uma forma de atribuição cumulativa.
        }

        System.out.printf("Valor da conta = R$ %.2f%n", conta);

        sc.close();
    }
}

/*

Operadores de atribuição cumulativa

a += b;                      a = a + b;
a -= b;                      a = a - b;
a *= b;                      a = a * b;
a /= b;                      a = a / b;
a %= b;                      a = a % b;

explicação: basicamente é uma forma abreviada de escrever uma variável e ela recebe a mesma coisa.

 */