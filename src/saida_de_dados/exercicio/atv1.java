package saida_de_dados.exercicio;

import java.util.Locale;

    /*

    -> Para concatenar vários elementos em um mesmo comando de escrita

    %f = ponto flutuante
    %d = inteiro
    %s = texto
    %n = quebra de linha

    */

    /*

        Agora suponha que eu queira controlar a quantidade de casas decimais, eu quero
        imprimir com duas casas.

        é só utilizar o macetes, no lugar do println colocamos printf é abreviação formatado.

        para que eu possa especificar qual eu quero duas casas decimais é utilizando "%.2f%n, variável"

        %.2f = indica que você quer delimitar duas casas decimais
        %n = é a quebra de linha
    */

    /*

        sobre a vírgula: printf por padrão da linguagem java, pega o formato do computador que você estíver usando.
        e o meu computador, o idioma do seu português está no português do Brasil.
        então por isso vai pegar o separador decimais da língua português que é a vírgula
        para que eu possa colocar o ponto no separador, é necessário configurar no programa para dos Estados Unidos.

        utilizando o:
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);

    */

public class atv1 {

    public static void main(String[] args){

        String product1 = "Computer";
        double price1 = 2100.0;
        System.out.printf("%s, which price is $ %.2f %n", product1, price1);


        String product2 = "Office desk";
        double price2 = 650.00;
        System.out.printf("%s, which price is $ %.2f %n", product2, price2);


        int age = 30;
        int code = 5290;
        char gender = 'F';
        System.out.printf("%d years old, code %d and gender: %c%n", age, code, gender);

        double measure = 53.234567;
        System.out.printf("Measure with eight decima places: %.8f %n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);

        Locale.setDefault(Locale.US);
        System.out.printf("US Decimal point: %.3f %n", measure);


    }
}
