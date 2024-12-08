package m3;

import java.util.Scanner;

public class M3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dimension de la matriz: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        System.out.println("Ingresa los valores de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int sp = 0, ss = 0;
        for (int i = 0; i < n; i++) {
            sp += mat[i][i];
            ss += mat[i][n - i - 1];
        }

        System.out.println("Suma diagonal principal " + sp);
        System.out.println("Suma diagonal secundaria " + ss);
    }
}
