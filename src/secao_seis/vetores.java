package secao_seis;

import java.util.Locale;
import java.util.Scanner;

public class vetores {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // ============================================
        // VETOR DINÂMICO: lê o TAMANHO N do vetor
        // N = quantidade de elementos que o usuário quer armazenar
        // ============================================
        int N = sc.nextInt();                    // Ex: usuário digita 6
        double[] vet = new double[N];            // Cria VETOR de double com N posições [0..N-1]

        // ============================================
        // PREENCHENDO O VETOR: lê N números e armazena nas posições 0, 1, 2... N-1
        // for(i=0; i<N; i++) = percorre TODAS as posições do vetor
        // vet[i] = posição i do vetor (i vai de 0 até N-1)
        // ============================================
        for(int i = 0; i < N; i++){
            vet[i] = sc.nextDouble();           // Lê número e guarda na posição i
            // Exemplo: N=3 → vet[0]=5.2, vet[1]=3.1, vet[2]=8.7
        }

        // ============================================
        // IMPRIMINDO O VETOR: percorre novamente e exibe cada elemento
        // %.2f = formata com EXATAMENTE 2 casas decimais
        // %n = quebra de linha após cada número
        // ============================================
        for(int i = 0; i < N; i++){
            System.out.printf("%.2f%n", vet[i]);  // Imprime vet[0], vet[1], vet[2]...
            // Saída:
            // 5.20
            // 3.10
            // 8.70
        }

        sc.close();
    }
}

/*

Um vetor corresponde a uma coleção de dados de tamanho fixo, indexada, unimensional e homogênea

-> indexada: os elementos são acessados por meio de índices
-> unidimensional: uma dimensão
-> Homogênea: todos dados são do mesmo tipo

Vetores são também chamados de --ARRANJOS-- unidimensionais
Em java a primeira posição e um vetor é a posição 0
Um arranjo deve ser alocado previamente, antes de ser utilizado. Uma vez alocado, sua quantidade de elementos é fixa

 */