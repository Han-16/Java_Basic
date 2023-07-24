package BackTracking;

import java.util.Scanner;
import java.util.Arrays;

public class N_Rooks {
    static int N;
    static int[][] map;
    static int[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        map = new int[N][N];
        visited = new int[N];
        int row = 0;

        checkRook(row);
    }

    public static void checkRook(int row) {
        if (row == N) {
            printResult();
            return;
        } else {
            for (int col = 0; col < N; col++) {
                 if (visited[col] != 1) {
                    map[row][col] = 1;
                    visited[col] = 1;
                    row++;
                    checkRook(row);
                    row--;
                    visited[col] = 0;
                    map[row][col] = 0;
                 }
            }
        }
        return;
    }

    public static void printResult() {
        for (int i = 0; i < N; i++) {
            System.out.println(Arrays.toString(map[i]));
        }
        System.out.println("---------------");
    }
}
