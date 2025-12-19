package secao_quatro.URI;

import java.util.Scanner;

public class URI_1038 {

    public static void main(String[] args) {

        // ============================================
        // Scanner = ferramenta para "escutar" o teclado do usuário
        // System.in = "leia do teclado"
        // ============================================
        Scanner sc = new Scanner(System.in);

        // ============================================
        // Lê DOIS números inteiros que o usuário digita:
        // 1º = CODIGO do produto (1, 2, 3, 4 ou 5)
        // 2º = QUANTIDADE comprada
        // ============================================
        int codigo = sc.nextInt();     // Ex: 1 (salmão)
        int quantidade = sc.nextInt(); // Ex: 3 (3 unidades)

        double total;  // Caixa vazia para guardar o preço final (double = permite casas decimais)

        // ============================================
        // ESTRUTURA CONDICIONAL EM CASCATA: "escolha um só"
        // O Java testa de CIMA para BAIXO e executa o PRIMEIRO que for verdadeiro
        // ============================================

        if (codigo == 1) {           // SE código for EXATAMENTE 1
            total = quantidade * 4.0;  // Preço = quantidade × R$4,00 (Salmão)
        }
        else if (codigo == 2) {      // SENÃO, SE código for EXATAMENTE 2
            total = quantidade * 4.5;  // Preço = quantidade × R$4,50 (Filé)
        }
        else if (codigo == 3) {      // SENÃO, SE código for EXATAMENTE 3
            total = quantidade * 5.0;  // Preço = quantidade × R$5,00 (Carne)
        }
        else if (codigo == 4) {      // SENÃO, SE código for EXATAMENTE 4
            total = quantidade * 2.0;  // Preço = quantidade × R$2,00 (Queijo)
        }
        else {                      // SENÃO (código = 5 ou qualquer outro)
            total = quantidade * 1.5;  // Preço = quantidade × R$1,50 (default)
        }

        // ============================================
        // printf = "print formatado" = escreve com FORMATO específico
        // %.2f = "número com 2 casas decimais"
        // %n = "pula linha"
        // ============================================
        System.out.printf("Total: R$ %.2f%n", total);

    }
}