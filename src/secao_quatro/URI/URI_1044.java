package secao_quatro.URI;

import java.util.Locale;
import java.util.Scanner;

public class URI_1044 {

    public static void main(String[] args){
        // ============================================
        // Scanner = ferramenta para "escutar" o teclado do usuário
        // ============================================
        Scanner sc = new Scanner(System.in);

        // ============================================
        // Lê DOIS números INTEIROS do usuário
        // A e B = os dois números para comparar
        // ============================================
        int A = sc.nextInt();  // Primeiro número
        int B = sc.nextInt();  // Segundo número

        // ============================================
        // % = OPERADOR RESTO DA DIVISÃO
        // A % B == 0 = "A dividido por B SOBRA 0" = "B divide A perfeitamente"
        // B % A == 0 = "B dividido por A SOBRA 0" = "A divide B perfeitamente"
        // ============================================

        if (A % B == 0 || B % A == 0) {       // SE (A é múltiplo de B) OU (B é múltiplo de A)
            System.out.println("Sao Multiplos");  // Um divide o outro perfeitamente
        }
        else {                                // SENÃO (nenhum divide o outro)
            System.out.println("Nao sao Multiplos");
        }

        sc.close();
    }
}
