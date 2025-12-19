package secao_quatro.URI;

import java.util.Locale;
import java.util.Scanner;

public class URI_1045 {

    public static void main(String[] args){

        // ============================================
        // Locale.US = força PONTO (.) nas casas decimais
        // ============================================
        Locale.setDefault(Locale.US);

        // ============================================
        // Scanner para ler os 3 lados do triângulo
        // ============================================
        Scanner sc = new Scanner(System.in);

        // ============================================
        // Lê os 3 lados do triângulo (podem ter casas decimais)
        // ============================================
        double n1 = sc.nextDouble();  // Lado 1
        double n2 = sc.nextDouble();  // Lado 2
        double n3 = sc.nextDouble();  // Lado 3

        double A, B, C;  // A=maior, B=meio, C=menor (vamos ordenar)

        // ============================================
        // PRIMEIRA PARTE: ORDENA OS LADOS (A ≥ B ≥ C)
        // Testa qual é o MAIOR lado primeiro
        // ============================================
        if (n1 > n2 && n1 > n3) { // SE n1 é o MAIOR
            A = n1;
            if (n2 > n3) { // Entre n2 e n3, qual é maior?
                B = n2; C = n3;
            } else {
                B = n3; C = n2;
            }
        }
        else if (n2 > n3) { // SENÃO SE n2 é o MAIOR
            A = n2;
            if (n1 > n3) {
                B = n1; C = n3;
            } else {
                B = n3; C = n1;
            }
        }
        else { // SENÃO n3 é o MAIOR
            A = n3;
            if (n1 > n2) {
                B = n1; C = n2;
            } else {
                B = n2; C = n1;
            }
        }

        // ============================================
        // SEGUNDA PARTE: VERIFICA SE FORMA TRIÂNGULO
        // Regra: A < B + C (senão não fecha o triângulo)
        // ============================================
        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        }
        else {
            // ============================================
            // TERCEIRA PARTE: TIPO POR ÂNGULOS (Teorema de Pitágoras)
            // A² = B² + C² → RETÂNGULO (90°)
            // A² > B² + C² → OBTUSO (um ângulo > 90°)
            // A² < B² + C² → ACUTO (todos < 90°)
            // ============================================
            if (A*A == B*B + C*C) {
                System.out.println("TRIANGULO RETANGULO");
            }
            else if (A*A > B*B + C*C) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            else {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            // ============================================
            // QUARTA PARTE: LADOS IGUAIS
            // ============================================
            if (A == B && B == C) {      // TODOS 3 iguais
                System.out.println("TRIANGULO EQUILATERO");
            }
            else if (A == B || A == C || B == C) {  // 2 iguais (|| = "OU")
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        sc.close();
    }
}
