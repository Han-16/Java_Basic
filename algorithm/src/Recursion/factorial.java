package Recursion;

public class factorial {
    public static void main(String[] args) {
        int result = 1;
        int num = 1;

        int answer = fac(result, num);

        System.out.println(answer);
    }

    private static int fac(int result, int num) {
        for(num = 1; num <= 10; num++) {
            result = result * num;
        }
        return result;
    }

    private static int facto(int result, int num) {
        int rtn = 0;
        if (num > 10) {
            rtn = result;
            return rtn;
        } else {
            return facto(result * num, num + 1);
        }
    }
}
