package Recursion;
import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N? ");
        int N = sc.nextInt();

        System.out.print("M?");
        int M = sc.nextInt();

        System.out.println("---------------------------");
        int answer = power(N, M);
        System.out.println(answer);
        sc.close();
    }

    public static int power(int N, int M) {
        if (M == 0) {
            return 1;
        } else if (M % 2 == 0) {
            return power(N, M / 2) * power(N, M / 2);
        } else {
            return N * power(N, (M - 1));
        }
    }
}
