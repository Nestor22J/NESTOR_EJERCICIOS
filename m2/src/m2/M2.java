package m2;

import java.util.Scanner;

public class M2 {

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

        System.out.println("Matriz generada ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        int sumaPerimetro = 0;
        for (int j = 0; j < n; j++) {
            sumaPerimetro += mat[0][j] + mat[n - 1][j];
        }
        for (int i = 1; i < n - 1; i++) {
            sumaPerimetro += mat[i][0] + mat[i][n - 1];
        }

        System.out.println("Suma de los elementos del perimetro: " + sumaPerimetro);
    }
}
