package teste_de_mesa;

import java.util.Scanner;

public class vetor_1 {

    public static void main(String[] args) {

        int valorA = 2;
        int valorB = 5;

        int[] v = new int[valorB + 1]; // Vetor V: tamanho b+1 = 6 posições (0,1,2,3,4,5). Inicia com 0s
        int[] w = new int[valorB]; // Vetor W: tamanho b = 5 posições (0,1,2,3,4). Inicia com 0s

        // Laço: d=1,2,3,4,5 (CORRIGIDO: <= b para rodar 5x)
        for (int d = 1; d <= valorB; d++) {  // <= b é a correção!
            v[d] = valorA;           // Posição d recebe A atual (ex: v[1]=2)

            valorA = valorA * 2;          // DOBRA A (2→4→8→16→32→64)

            w[d - 1] = valorA;       // Posição d-1 recebe novo A (w[0]=4)
        }

        // Imprime V: i de 0 até 5 (6 números: 0 2 4 8 16 32)
        System.out.print("v: ");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();  // Nova linha

        // Imprime W: i de 0 até 4 (5 números: 4 8 16 32 64)
        System.out.print("w: ");
        for (int i = 0; i < w.length; i++) {
            System.out.print(w[i] + " ");
        }
        System.out.println();
    }
}
