package Stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;


class CompareString implements BinaryOperator<String> {
    @Override
    public String apply(String s1, String s2) {
        return (s1.getBytes().length >= s2.getBytes().length) ? s1 : s2;
    }
}


public class ReduceTest {
    public static void main(String[] args) {
        String greetings[] = {"Hello~~~", "hello", "Gooodddd morning", "nice 2 meet u"};

        System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {
            return (s1.getBytes().length >= s2.getBytes().length) ? s1 : s2;
        }));

        String str = Arrays.stream(greetings).reduce(new CompareString()).get();
        System.out.println(str);
    }
}
