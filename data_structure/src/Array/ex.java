package Array;

import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("N : ");
        int N = sc.nextInt();

        int[][] matrix = new int[N][N];

        int value = 1;
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < N; j++) {
                    matrix[i][j] = value;
                    value++;
                }
            } else {
                for (int j = N - 1; j >= 0; j--) {
                    matrix[i][j] = value;
                    value++;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
