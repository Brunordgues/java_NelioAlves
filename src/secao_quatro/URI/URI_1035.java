package secao_quatro.URI;

import java.util.Scanner;

public class URI_1035 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);


        int A = entrada.nextInt();
        int B = entrada.nextInt();
        int C = entrada.nextInt();
        int D = entrada.nextInt();

        // Condição completa para validar se A,B,C,D formam um quadrilátero válido:
        if(B > C && D > A && (C + D > A + B) && C > 0 && A % 2 == 0){

             /*
            B > C          -> Lado B maior que lado C (condição de triângulo desigualdade)
            D > A          -> Lado D maior que lado A
            C + D > A + B  -> Soma de quaisquer 2 lados > soma dos outros 2 (quadrilátero válido)
            C > 0          -> Lado C positivo (sem lados negativos)
            A % 2 == 0     -> Lado A par (requisito específico do problema)
            */

            // Bloco vazio - quando condições atendidas, NÃO imprime nada

        }else{
            System.out.println("Valores nao aceitos");
        }

        entrada.close();
    }
}
