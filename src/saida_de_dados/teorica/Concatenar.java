package saida_de_dados.teorica;

import java.util.Locale;

public class Concatenar {

    public static void main(String[] args) {

        // Declara uma variável do tipo double (número com ponto flutuante)
        double x = 10.35784;

        // Define o padrão local para os EUA (ponto como separador decimal)
        Locale.setDefault(Locale.US);

        // Imprime o valor de x com 4 casas decimais e quebra de linha (%n)
        System.out.printf("%.4f%n", x);

        // Concatena texto e variável usando o operador (+)
        System.out.println("RESULTADO = " + x + " METROS ");

        // Imprime o valor formatado com 2 casas decimais
        System.out.printf("RESULTADO = %.2f metros%n", x);

        /* ------------------------------------------------------------------------------------
         * SÍMBOLOS DE FORMATOS (placeholders):
         *
         * %f  -> número de ponto flutuante (float/double)
         * %d  -> número inteiro (int)
         * %s  -> texto (String)
         * %n  -> quebra de linha (igual ao \n, mas mais portável)
         * ------------------------------------------------------------------------------------
         */

        // Declaração de variáveis de tipos diferentes
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        // Exemplo de concatenação com múltiplos tipos de dados
        // %s -> nome, %d -> idade, %.2f -> renda com 2 casas decimais
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
}
