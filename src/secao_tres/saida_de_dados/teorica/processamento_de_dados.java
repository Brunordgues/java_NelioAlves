package secao_tres.saida_de_dados.teorica;

public class processamento_de_dados {

    public static void main(String[] args){

        // exemplo 1 ------------
        int x, y;

        x = 5;
        y = 2 * x;

        System.out.println(x);
        System.out.println(y);


        //exemplo 2 -------------
        int a;
        double d;

        a = 5;
        d = 2* x;

        System.out.println(a);
        System.out.println(d);


        //exemplo 3 BHASKARA II é foda demaisss !!
        double b, B, h, area;

        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B) / 2.0 * h;

        System.out.println(area);


        /*

        dica: sempre indique o tipo do número, se a expressão for de ponto flutuante (não inteira)

        para double use: .0 (mesmo qu eo número não tiver nenhum valor de casa decimais e você coloca o ponto zero
        só para indicar que é um número double)

        para float use: f

         */

        float bb, BB, hh, areap;

        bb = 8f;
        BB = 3f;
        hh = 5f;

        areap = (bb + BB) / 2f * hh;

        System.out.println(areap);

    }




}
