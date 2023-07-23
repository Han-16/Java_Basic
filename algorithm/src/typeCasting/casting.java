package typeCasting;

public class casting {

    public static void main(String[] args) {
        int num = 3;
        double dblNum = (double) num;
        System.out.println(num);
        System.out.println(dblNum);

        char charA = 'A';
        int numA = (int) charA;
        System.out.println(numA);

        char charB = (char) (numA + 1);
        System.out.println(charB);


        String toInt = "123";
        String toLong = "3000000";
        String toDouble = "1.5";

        int parseInt = Integer.parseInt(toInt);
        long parseLong = Long.parseLong(toLong);
        double parseDouble = Double.parseDouble(toDouble);

        System.out.println(parseInt);
        System.out.println(parseLong);
        System.out.println(parseDouble);


        int number = 1234;
        String toString = Integer.toString(number);

    }
}
