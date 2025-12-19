package secao_quatro.URI;

import java.util.Locale;
import java.util.Scanner;

public class URI_1040 {

    public static void main(String[] args){

        // ============================================
        // Locale.US = FORÇA o Java a usar PONTO (.) ao invés de VÍRGULA (,) nas casas decimais
        // IMPORTANTE no Brasil, onde o Windows usa vírgula por padrão
        // ============================================
        Locale.setDefault(Locale.US);

        // ============================================
        // Scanner para ler números com casas decimais do usuário
        // ============================================
        Scanner sc = new Scanner(System.in);

        // ============================================
        // Lê 4 notas FLUTUANTES (float = permite casas decimais)
        // n1, n2, n3, n4 = as 4 notas do aluno
        // ============================================
        float n1 = sc.nextFloat();  // Nota 1
        float n2 = sc.nextFloat();  // Nota 2
        float n3 = sc.nextFloat();  // Nota 3
        float n4 = sc.nextFloat();  // Nota 4

        // ============================================
        // MÉDIA PONDERADA = cada nota tem um PESO diferente
        // Fórmula: (n1×2 + n2×3 + n3×4 + n4×1) ÷ 10
        // 2f, 3f, 4f, 1f, 10f = os "f" forçam o Java a tratar como FLOAT
        // ============================================
        float media = (n1 * 2f + n2 * 3f + n3 * 4f + n4 * 1f) / 10f;

        // Exibe a média com 1 casa decimal
        System.out.printf("Media: %.1f%n", media);

        // ============================================
        // SISTEMA DE APROVAÇÃO
        // ============================================
        if(media >= 7f){                    // SE média ≥ 7,0
            System.out.println("Aluno aprovado!!");
        }
        else if(media < 5f){                // SENÃO SE média < 5,0
            System.out.println("Aluno reprovado!!");
        }
        else{                               // SENÃO (média entre 5,0 e 6,9)
            System.out.println("Aluno em exame");
            float notaExame = sc.nextFloat();  // Lê nota do exame final
            System.out.printf("Nota do exame: %.1f%n", notaExame);
            // Nota: o código original não calcula a média final do exame
        }
    }
}
