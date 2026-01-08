package secao_seis;

import java.util.Scanner;

public class estrutura_para_cada {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] nomes = new String[n];

        for(int i=0; i<n; i++){
            nomes[i] = sc.next();
        }

        System.out.println("Nomes lidos: ");
        for(String s : nomes){
            System.out.println(s);
        }
    }
}
