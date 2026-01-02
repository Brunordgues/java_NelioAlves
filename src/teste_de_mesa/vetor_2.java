package teste_de_mesa;

public class vetor_2 {

    public static void main(String[] args){

        int valorA = 10;
        int valorB = 20;

        int media = (valorA + valorB) / 2;
        media -= 40;

        int[] vetorV = new int[5];
        vetorV[4] = valorA + valorB + media;

        System.out.println("v[4] = " + vetorV[4]);

    }
}
