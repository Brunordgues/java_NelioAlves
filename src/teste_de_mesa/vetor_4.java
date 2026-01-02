package teste_de_mesa;

public class vetor_4 {

    public static void main(String[] args){

        int[] v = new int[7];

        int valorA = 7;
        int valorB = (valorA - 6);

        while (valorB < valorA){
            v[valorB] = valorB * valorA;
            valorB = valorB + 2;
        }

        System.out.print("v: ");
        for(int i = 0; i < v.length; i++){
            System.out.print(v[i] + " ");
        }
    }
}
