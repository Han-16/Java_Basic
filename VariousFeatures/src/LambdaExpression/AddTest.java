package LambdaExpression;

public class AddTest {
    public static void main(String[] args) {
        Add addIns = (x, y) -> x + y;

        System.out.println(addIns.add(2, 3));
    }
}
