package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<>();

        sList.add("Alice");
        sList.add("Jack");
        sList.add("Bob");
        sList.add("ASAP");

        Stream<String> listStream = sList.stream();
        listStream.forEach(s -> System.out.println(s));
        System.out.println();

        sList.stream().sorted().forEach(name -> System.out.println(name));
        System.out.println();
        sList.stream().map(s -> s.length()).forEach(len -> System.out.println(len + "\t"));
        System.out.println();
        sList.stream().filter(s -> s.length() >= 5).forEach(s -> System.out.println(s));
    }
}
