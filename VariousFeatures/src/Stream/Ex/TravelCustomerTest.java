package Stream.Ex;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerTest {
    public static void main(String[] args) {

        TravelCustomer Han = new TravelCustomer("zz", 24, 100);
        TravelCustomer Kim = new TravelCustomer("aa", 22, 100);
        TravelCustomer Choi = new TravelCustomer("dd", 10, 50);

        List<TravelCustomer> custList = new ArrayList<>();
        custList.add(Han);
        custList.add(Kim);
        custList.add(Choi);

        System.out.println("Customer List");
        custList.stream().map(c -> c.getName())
                .forEach(n -> System.out.println(n));


        System.out.println("Total Price");
        System.out.println(custList.stream()
                .mapToInt(c -> c.getPrice())
                .sum());


        System.out.println("Sorting(Over 20)");
        custList.stream().filter(c -> c.getAge() >= 20)
                .map(c -> c.getName())
                .sorted()
                .forEach(s -> System.out.println(s));
    }
}
