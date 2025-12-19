package secao_quatro.URI;

import java.util.Locale;
import java.util.Scanner;

public class URI_1041 {

    public static void main(String[] args){

        // ============================================
        // Locale.US = força PONTO (.) nas casas decimais
        // ============================================
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // ============================================
        // Lê as COORDENADAS (x, y) de um ponto no plano cartesiano
        // double = permite números decimais precisos
        // ============================================
        double x = sc.nextDouble();  // Coordenada X (horizontal)
        double y = sc.nextDouble();  // Coordenada Y (vertical)

        // ============================================
        // SISTEMA DE CLASSIFICAÇÃO DO PONTO
        // ============================================

        if (x == 0.0 && y == 0.0) {         // SE X=0 E Y=0
            System.out.println("Origem");   // Ponto está no CENTRO (0,0)
        }
        else if (x == 0.0) {                // SENÃO SE X=0 (Y ≠ 0)
            System.out.println("Eixo Y");   // Ponto está na VERTICAL central
        }
        else if (y == 0.0) {                // SENÃO SE Y=0 (X ≠ 0)
            System.out.println("Eixo X");   // Ponto está na HORIZONTAL central
        }
        else if (x > 0.0 && y > 0.0) {      // SENÃO SE X>0 E Y>0
            System.out.println("Q1");       // 1º Quadrante (DIREITA, CIMA)
        }
        else if (x < 0.0 && y > 0.0) {      // SENÃO SE X<0 E Y>0
            System.out.println("Q2");       // 2º Quadrante (ESQUERDA, CIMA)
        }
        else if (x < 0.0 && y < 0.0) {      // SENÃO SE X<0 E Y<0
            System.out.println("Q3");       // 3º Quadrante (ESQUERDA, BAIXO)
        }
        else {                              // SENÃO (X>0 E Y<0)
            System.out.println("Q4");       // 4º Quadrante (DIREITA, BAIXO)
        }

        sc.close();  // Fecha o Scanner
    }
}
