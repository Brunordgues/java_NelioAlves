package secao_quatro.URI;

import java.util.Scanner;

public class URI_1046 {

    public static void main(String[] args){

        // ============================================
        // Scanner = ferramenta para "escutar" o teclado do usuário
        // ============================================
        Scanner sc = new Scanner(System.in);

        // ============================================
        // Lê as HORAS do início e fim do jogo (formato 24h: 0 a 23)
        // ============================================
        int horaInicial = sc.nextInt();  // Ex: 16 (4 da tarde)
        int horaFinal = sc.nextInt();    // Ex: 2 (2 da manhã)

        // ============================================
        // Calcula a DURAÇÃO do jogo em HORAS
        // ============================================
        int duracao;

        if (horaInicial < horaFinal) {         // CASO 1: Jogo NO MESMO DIA
            // Ex: 16h até 20h = 4 horas
            duracao = horaFinal - horaInicial;
        }
        else {                                 // CASO 2: Jogo PASSA DA MEIA-NOITE
            // Ex: 23h até 2h = (24-23) + 2 = 1 + 2 = 3 horas
            duracao = 24 - horaInicial + horaFinal;
        }

        // ============================================
        // Exibe o resultado com CONCATENAÇÃO de strings (+)
        // ============================================
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}
