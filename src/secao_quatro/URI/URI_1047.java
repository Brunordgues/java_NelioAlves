package secao_quatro.URI;

import java.util.Scanner;

public class URI_1047 {

    public static void main(String[] args){

        // ============================================
        // Scanner = ferramenta para "escutar" o teclado do usuário
        // ============================================
        Scanner sc = new Scanner(System.in);

        // ============================================
        // Lê INÍCIO e FIM do jogo em HORAS e MINUTOS
        // Formato: H1 M1 H2 M2
        // ============================================
        int horaInicial = sc.nextInt();     // Ex: 16 (4 da tarde)
        int minutoInicial = sc.nextInt();   // Ex: 50
        int horaFinal = sc.nextInt();       // Ex: 2 (2 da manhã)
        int minutoFinal = sc.nextInt();     // Ex: 10

        // ============================================
        // CONVERTE tudo para MINUTOS TOTAL (facilita o cálculo)
        // 1 hora = 60 minutos
        // ============================================
        int instanteInicial = horaInicial * 60 + minutoInicial;  // Ex: 16*60 + 50 = 1010 min
        int instanteFinal = horaFinal * 60 + minutoFinal;        // Ex: 2*60 + 10 = 130 min

        // ============================================
        // Calcula DURAÇÃO TOTAL em MINUTOS
        // ============================================
        int duracao;
        if (instanteInicial < instanteFinal) {         // CASO 1: MESMO DIA
            // Ex: 1010 até 1200 = 190 minutos
            duracao = instanteFinal - instanteInicial;
        }
        else {                                         // CASO 2: PASSA MEIA-NOITE
            // Ex: 1010 até 130 = (24*60-1010) + 130 = 950 + 130 = 1080 minutos
            duracao = (24 * 60 - instanteInicial) + instanteFinal;
        }

        // ============================================
        // CONVERTE MINUTOS TOTAL de volta para HORAS e MINUTOS
        // / = DIVISÃO INTEIRA (descarta resto)
        // % = RESTO da divisão
        // ============================================
        int duracaoHoras = duracao / 60;     // Ex: 1080 / 60 = 18 horas
        int duracaoMinutos = duracao % 60;   // Ex: 1080 % 60 = 0 minutos

        // ============================================
        // Exibe com CONCATENAÇÃO de strings
        // ============================================
        System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");

        sc.close();
    }
}
