package Recursion;
import java.util.Scanner;

public class PrimeFac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N : ");
        int N = sc.nextInt();
        sc.close();

        primeFac(N);
    }

    public static void primeFac(int N) {
        for (int i = 2; i <= N; i++) {
            if (N % i == 0) {
                System.out.print(i + " ");
                primeFac(N / i);
                return;
            }
        }
    }
}
