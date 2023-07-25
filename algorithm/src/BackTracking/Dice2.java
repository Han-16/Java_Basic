package BackTracking;
import java.util.Scanner;
import java.util.Arrays;

public class Dice2 {
    static int N;
    static int[] result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        N = sc.nextInt();
        result = new int[N];
        int cnt = 0;
        boolean[] visited = new boolean[N];


        roll(cnt);
        System.out.println(Arrays.toString(result));
    }

    private static void roll(int cnt) {
        if (cnt == N) {
            System.out.println(Arrays.toString(result));
            return;
        } else {
            for (int i = 1; i <= 6; i++) {
                result[cnt] = i;

            }
        }
    }
}