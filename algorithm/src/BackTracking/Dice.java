package BackTracking;
import java.util.Scanner;
import java.util.Arrays;

public class Dice {
    static int N;
    static int[] result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        N = sc.nextInt();
        result = new int[N];
        int diceNum = 0;

        roll(diceNum);
    }

    private static void roll(int diceNum) {
        if (diceNum == N) {
            System.out.println(Arrays.toString(result));
            return;
        } else {
            for (int i = 1; i <= 6; i++) {
                result[diceNum] = i;
                diceNum++;
                roll(diceNum);
                diceNum--;
                result[diceNum] = 0;
            }
        }
    }
}


