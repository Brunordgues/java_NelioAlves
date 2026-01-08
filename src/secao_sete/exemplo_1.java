package secao_sete;

import java.util.Scanner;

public class exemplo_1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();  // Nº linhas
        int N = sc.nextInt();  // Nº colunas

        int[][] mat = new int[M][N];  // Matriz M x N

        // Lê TODOS elementos linha por linha
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Imprime matriz formatada
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();  // Nova linha após cada linha
        }

        sc.close();
    }
}

/*

matrizes são também chamadas de arranjos (array) bidimensionais

em java a primeira posição de uma matriz é a posição  0,0 (linha 0, coluna 0)

um arranjo deve ser alocado previamente, antes de ser utilizado. uma vez alocado, sua quantidade de elemento é fixa

 */