package saida_de_dados;

import java.util.Locale;

public class helloWorld {

    public static void main(String[] args){
        // ------------------------------------------------------
        // Exemplo: controlando quantas casas decimais exibir
        // ------------------------------------------------------

        // Declarar uma variável double (número com casas decimais)
        double x = 10.35784;

        // Exibe o valor padrão, sem formatação especial
        System.out.println(x); // Saída: 10.35784 (padrão do SO/idioma)

        // Exibe x com duas casas decimais usando printf
        // %.2f   -> mostra dois números após a vírgula/ponto
        // %n     -> quebra de linha, igual ao \n, mas mais portátil
        System.out.printf("%.2f%n", x); // Exemplo de saída: 10,36 (em PT-BR)

        // Exibe x com quatro casas decimais
        System.out.printf("%.4f%n", x); // Saída: 10,3578 (em PT-BR)

        // ------------------------------------------------------
        // Sobre o separador decimal: vírgula ou ponto?
        // ------------------------------------------------------
        // Por padrão, o printf usa as configurações de idioma do seu sistema:
        // - Português do Brasil: usa vírgula para separar decimais
        // - Inglês/EUA: usa ponto

        // Para forçar que sempre seja ponto como separador decimal,
        // configure o Locale para US (Estados Unidos):
        Locale.setDefault(Locale.US);

        // Agora a saída será com ponto separando as casas decimais
        System.out.printf("%.4f%n", x); // Saída: 10.3578 (com ponto)

        // ------------------------------------------------------
        // Resumo dos comandos mais usados:
        // %.2f -> delimita para duas casas decimais
        // %.4f -> quatro casas decimais
        // %n   -> quebra de linha
        // printf -> permite formatar a saída
        // ------------------------------------------------------
    }
}
