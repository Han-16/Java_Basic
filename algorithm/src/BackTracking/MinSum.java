package BackTracking;
import java.util.Scanner;
import java.util.Arrays;

public class MinSum {
    static int N;
    static int[][] map;
    static int[] visited;
    static int result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new int[N][N];
        visited = new int[N];
        result = Integer.MAX_VALUE;
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                map[r][c] = sc.nextInt();
            }
        }

        System.out.println("map : ");
        for(int[] r : map) {
            System.out.println(Arrays.toString(r));
        }

        int row = 0;
        int sum = 0;

        selectMin(row, sum);
        System.out.println("result : " + result);
    }

    public static void selectMin(int row, int sum) {
        if (row == N) {
            result = Math.min(result, sum);
            return;
        } else {
            if (sum > result) {
                return;
            }
            for (int col = 0; col < N; col++) {
                if (visited[col] != 1) {
                    sum = sum + map[row][col];
                    visited[col] = 1;
                    row++;
                    selectMin(row, sum);
                    row--;
                    visited[col] = 0;
                    sum = sum - map[row][col];
                }
            }
        }
        return;
    }
}
