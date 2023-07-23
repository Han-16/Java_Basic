package ArrayList;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(list.toString());

        list.add(1);
        list.add(10);
        list.add(34);
        list.add(2);
        list.add(9);
        System.out.println(list.toString());

        list.add(0, 100);
        list.add(3, 30000);
        System.out.println(list.toString());

        list.remove(0);
        System.out.println(list.toString());

        System.out.println(list.get(3));
    }
}
