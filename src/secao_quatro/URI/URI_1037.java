package secao_quatro.URI;

import java.util.Locale;
import java.util.Scanner;

public class URI_1037 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        float numero = entrada.nextFloat();

        // Primeiro: verifica se o número está fora do intervalo permitido [0, 100]
        if(numero < 0.0 || numero > 100.0){ // Se for menor que 0 OU maior que 100
            System.out.println("Fora de Intervalo");
        }

        // Se não entrou no if acima, então está entre 0 e 100
        else if(numero <= 25.0){ // Aqui já se sabe que numero >= 0.0, então testa de 0 até 25
            System.out.println("Intervalo [0,25]"); // Intervalo fechado de 0 até 25
        }

        // Aqui já se sabe que numero > 25.0, então testa até 50
        else if(numero <= 50.0){
            System.out.println("Intervalo [25,50]");// Intervalo (25,50] na lógica do problema
        }

        // Aqui já se sabe que numero > 50.0, então testa até 75
        else  if(numero <= 75.0){
            System.out.println("Intervalo [50,75]");
        }

        // Se não caiu em nenhum dos anteriores, só sobra o intervalo (75,100]
        else{
            System.out.println("Intervalo [75,100]");
        }

        entrada.close();
    }
}
