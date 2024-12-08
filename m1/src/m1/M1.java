package m1;

import java.util.Scanner;

public class M1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dimension de la matriz ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        System.out.println("Ingresa los valores de la matriz");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int[][] rot = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rot[j][n - 1 - i] = mat[i][j];
            }
        }

        System.out.println("Matriz rotada 90 grados");
        for (int[] fila : rot) {
            for (int e : fila) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}
