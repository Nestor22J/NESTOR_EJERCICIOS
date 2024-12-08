package m6;

import java.util.Scanner;

public class M6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Filas: ");
        int f = sc.nextInt();
        System.out.print("Columnas: ");
        int c = sc.nextInt();

        int[][] m = new int[f][c];
        System.out.println("Ingresa los valores de la matriz:");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz:");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        int[] e = new int[f * c];
        int idx = 0;
        int t = 0, b = f - 1, l = 0, r = c - 1;

        while (t <= b && l <= r) {
            for (int i = l; i <= r; i++) e[idx++] = m[t][i]; 
            t++;
            for (int i = t; i <= b; i++) e[idx++] = m[i][r]; 
            r--;
            if (t <= b) {
                for (int i = r; i >= l; i--) e[idx++] = m[b][i]; 
                b--;
            }
            if (l <= r) {
                for (int i = b; i >= t; i--) e[idx++] = m[i][l]; 
                l++;
            }
        }

        System.out.println("Espiral:");
        for (int i = 0; i < e.length; i++) System.out.print(e[i] + " ");
    }
}
