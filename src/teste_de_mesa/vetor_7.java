package teste_de_mesa;

public class vetor_7 {

    public static void main(String[] args) {

        int[] v = new int[7];
        int[] w = new int[7];
        int valorD;

        v[0] = 2;

        for (valorD = 1; valorD < 4; valorD++) {
            v[valorD] = v[valorD - 1] * 2;  // 4,8,16
        }

        for (valorD = 0; valorD < 4; valorD++) {
            w[valorD] = v[valorD] * 10;  // 20,40,80,160
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