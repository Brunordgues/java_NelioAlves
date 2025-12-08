package secao_quatro.sintaxe_do_switch_case;

/*

Problema exemplo:

Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semana (sendo 1=domingo, 2=segunda, e assim
por diante). Escrever na tela o dia da semana correspondente.

 */

import java.util.Scanner;

public class switch_case {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int x = entrada.nextInt();
        String dia;

        switch (x){
            case 1:
                dia = "Domingo";
                break;

            case 2:
                dia = "Segunda";
                break;

            case 3:
                dia = "Terça";
                break;

            case 4:
                dia = "Quarta";
                break;

            case 5:
                dia = "Quinta";
                break;

            case 6:
                dia = "Sexta";
                break;

            case 7:
                dia = "Sabádo";
                break;

            default:
                dia = "Valor invalido";
                break;
        }

        System.out.println("Dia de semana: " + dia);

        entrada.close();

    }


}

/*

Use `switch case` quando você estiver comparando **uma mesma variável contra várias opções fixas**; use `if else` quando precisar de **regras mais flexíveis ou condições complexas**.[1][5]

## Quando faz sentido usar switch

Use `switch` principalmente quando:

- Sempre testa **a mesma variável** (por exemplo, `opcaoMenu`, `diaSemana`, `status`).[5][1]
- Os casos são **valores específicos**, como números, chars, strings ou enums (1, 2, 3, `"S"`, `"N"`, `Status.PAGO`).[1]
- Há **muitas alternativas** (vários `if/else if` em sequência) e o código começa a ficar feio; o `switch` deixa mais organizado e legível.[5][1]
- Está implementando um **menu de opções** ou uma lógica de “múltipla escolha” clara (caso 1 faz isso, caso 2 faz aquilo...).[5]

Exemplo típico em Java:

```java
switch (opcao) {
    case 1:
        // cadastrar
        break;
    case 2:
        // listar
        break;
    case 3:
        // sair
        break;
    default:
        // opção inválida
}
```

## Quando continuar com if else

Prefira `if/else` quando:

- A condição envolve **intervalos** ou comparações mais ricas, como `nota >= 7 && frequencia >= 75` ou `idade > 18 && renda < 2000`.[4][1]
- As condições não são apenas “igual a um valor”, mas usam `>`, `<`, `>=`, `<=`, combinação com `&&`, `||` etc.[1][4]
- Você precisa de lógica mais “livre”, que não encaixa bem em “uma variável contra vários valores fixos”.[1]

 */
