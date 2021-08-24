package ApplicationofBinaryExp;

import java.io.*;
import java.util.*;

public class MatrixExponentiation {

    // Runner Code
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] A = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                A[i][j] = kb.nextInt();
        }
        int pow = kb.nextInt();

        int[][] ans = getExp(A, pow);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }

    // Same recursive code as that of Integer
    private static int[][] getExp(int[][] a, int pow) {

        if (pow == 0)
            return identity(a.length);

        if (pow % 2 == 0)
            return getExp(mul(a, a), pow / 2);
        return mul(getExp(mul(a, a), pow / 2), a);

    }

    // Return Identity Matrix
    static int[][] identity(int n) {
        int[][] id = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    id[i][j] = 1;
                }
            }
        }
        return id;
    }

    // Matrix Multiplication Code
    static int[][] mul(int[][] A, int[][] B) {
        int n = A.length;
        int[][] mul = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x = 0;
                for (int k = 0; k < n; k++) {
                    x += A[i][k] * B[k][j];
                }
                mul[i][j] = x;
            }
        }
        return mul;
    }

}
