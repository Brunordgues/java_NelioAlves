package secao_quatro.URI;

import java.util.Locale;
import java.util.Scanner;

public class URI_1048 {

    public static void main(String[] args){

        // ============================================
        // Locale.US = força PONTO (.) nas casas decimais
        // ============================================
        Locale.setDefault(Locale.US);

        // ============================================
        // Scanner para ler o salário atual
        // ============================================
        Scanner sc = new Scanner(System.in);

        // ============================================
        // Lê o SALÁRIO ATUAL do funcionário
        // double = permite centavos (R$ 1234.56)
        // ============================================
        double salario = sc.nextDouble();  // Ex: 1000.50

        // ============================================
        // TABELA DE PERCENTUAIS POR FAIXA SALARIAL
        // Define o % de reajuste baseado no salário atual
        // ============================================
        double percentual;
        if (salario <= 400.0) {           // Até R$400,00
            percentual = 15.0;            // +15%
        }
        else if (salario <= 800.0) {      // R$400,01 até R$800,00
            percentual = 12.0;            // +12%
        }
        else if (salario <= 1200.0) {     // R$800,01 até R$1200,00
            percentual = 10.0;            // +10%
        }
        else if (salario <= 2000.0) {     // R$1200,01 até R$2000,00
            percentual = 7.0;             // +7%
        }
        else {                            // Acima de R$2000,00
            percentual = 4.0;             // +4%
        }

        // ============================================
        // CALCULA O REAJUSTE e NOVO SALÁRIO
        // reajuste = salário × percentual ÷ 100
        // ============================================
        double reajuste = salario * percentual / 100.0;      // Ex: 1000 × 10 ÷ 100 = 100
        double novoSalario = salario + reajuste;             // Ex: 1000 + 100 = 1100

        // ============================================
        // EXIBE OS 3 RESULTADOS com printf formatado
        // %.2f = 2 casas decimais
        // %.0f = 0 casas decimais (inteiro)
        // %% = imprime o símbolo %
        // ============================================
        System.out.printf("Novo salario: %.2f%n", novoSalario);     // R$ 1100.00
        System.out.printf("Reajuste ganho: %.2f%n", reajuste);      // R$ 100.00
        System.out.printf("Em percentual: %.0f %% %n", percentual); // 10 %

        sc.close();
    }
}
