package secao_seis.exercicio_resolvido;

import java.util.Scanner;

public class exercicio_01 {

    public static void main() {

        // Cria o leitor de dados do teclado
        Scanner sc = new Scanner(System.in);

        // Lê a quantidade de números que serão digitados
        // N define o tamanho do vetor
        int N = sc.nextInt();

        // Cria um vetor de inteiros com N posições (índices 0 até N-1)
        int[] vet = new int[N];

        // Primeiro laço: ler os N números e armazenar no vetor
        for (int i = 0; i < N; i++) {
            // Em cada iteração, lê um número inteiro e guarda em vet[i]
            vet[i] = sc.nextInt();
        }

        // Segundo laço: percorrer o vetor e mostrar apenas os negativos
        for (int i = 0; i < N; i++) {
            // Se o valor da posição i for menor que zero, é negativo
            if (vet[i] < 0) {
                // Imprime o número negativo encontrado
                System.out.println(vet[i]);
            }
        }

        // Boa prática: fechar o Scanner
        sc.close();
    }
}
