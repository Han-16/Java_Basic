package OOP_Lambda;

public class StirngConcatTest {
    public static void main (String[] args) {

        String s1 = "Hello";
        String s2 = "World";

        StringConcatImpl strImpl = new StringConcatImpl();
        strImpl.makeString(s1, s2);


        StringConcat concat = (str1, str2) -> System.out.println(str1 +  ", " + str2);
        concat.makeString(s1, s2);

    }
}
