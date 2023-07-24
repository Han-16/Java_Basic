package Ex;

import java.util.Scanner;

public class PowerPlant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        int[][] PowerStations = new int[M][2];

        for (int i = 0; i < M; i++) {
            PowerStations[i][0] = sc.nextInt();
            PowerStations[i][1] = sc.nextInt();
        }
        sc.close();

        int total = N * N;
        for (int x = 0; x < N; x++) {

        }
    }


}