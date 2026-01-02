package teste_de_mesa;

public class vetor_6 {

    public static void main(String[] args){

        int v[] = new int[7];
        int w[] = new int[6];

        int valorA = 2;
        int valorB = 5;
        int valorC;

        for(valorC = 0; valorC < 3; valorC++){
            v[valorC] = valorA;
            w[valorC] = valorC * v[valorC];
        }

        System.out.print("v: ");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();

        System.out.print("w: ");
        for (int i = 0; i < w.length; i++) {
            System.out.print(w[i] + " ");
        }
        System.out.println();
    }
}
