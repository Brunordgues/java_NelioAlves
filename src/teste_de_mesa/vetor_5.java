package teste_de_mesa;

public class vetor_5 {

    public static void main(String[] args){

        int v[] = new int[5];
        int w[] = new int[5];

        int valorA;

        for(valorA = 0; valorA < 3; valorA++){
            v[valorA] = 5;
            w[valorA] = valorA;
        }

        System.out.print("v: ");
        for(int i = 0; i < v.length; i++){
            System.out.print(v[i] + " ");
        }
        System.out.println();

        System.out.print("w: ");
        for (int i = 0; i < w.length; i++) {
            System.out.print(w[i] + " ");
        }
    }
}
