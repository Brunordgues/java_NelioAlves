package secao_quatro.resolvidos;

import java.util.Locale;
import java.util.Scanner;



public class atv_1 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();

        double notaFinal = nota1 + nota2;
        System.out.printf("NOTA FINAL = %.1f%n", notaFinal);

        if (notaFinal > 60.0){
            System.out.println("APROVADO");
        }else{
            System.out.println("REPROVADO");
        }
    }
}


        /*
        Fazer um programa para ler as duas notas que um aluno obteve no primeiro e segundo semestres
        de uma disciplina anual. Em seguida, mostrar a nota final que o aluno obteve no ano com um texto explicativo.
        Caso a nota final do aluno seja inferior a 60,00, mostrar a mensagem
        "REPROVADO", conforme exemplos. Todos os valores devem ter uma casa decimal

        exemplos:

        ENTRADA:
        45.5
        31.3

        SAIDA:
        NOTA FINAL = 76.8

        ---------------------------------

        ENTRADA:
        34.0
        23.5

        SAIDA:
        NOTA FINAL = 57.5
        REPROVADO
         */