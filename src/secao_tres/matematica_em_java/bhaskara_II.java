package secao_tres.matematica_em_java;

import java.util.Locale;
import java.util.Scanner;

public class bhaskara_II {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, delta, x1, x2;

        System.out.print("Digite o valor de a: ");
        a = sc.nextDouble();

        System.out.print("Digite o valor de b: ");
        b = sc.nextDouble();

        System.out.print("Digite o valor de c: ");
        c = sc.nextDouble();

        // Cálculo do delta: Δ = b² - 4ac
        delta = Math.pow(b, 2.0) - 4 * a * c;

        // Fórmula de Bhaskara
        x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

        System.out.println("Delta = " + delta);
        System.out.println("X1 = " + x1);
        System.out.println("X2 = " + x2);

        sc.close();

    }

    /*

    sqrt = raiz quadrada
    pow = potenciação
    abs = valor absoluto

     */
}
