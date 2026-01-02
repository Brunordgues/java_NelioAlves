package teste_de_mesa;

public class vetor_3 {

    public static void main(String[] args){

        int[] v = new int[10];
        int valorA = 2;

        while(valorA < 6){
            v[valorA] = 10 * valorA;

            valorA = valorA + 1;
        }

        System.out.print("v: ");
        for(int i = 0; i < v.length; i++){
            System.out.print(v[i] + " ");
        }
    }
}
