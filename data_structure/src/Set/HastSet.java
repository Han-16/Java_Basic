package Set;

import java.util.HashSet;

public class HastSet {
    public static void main(String[] args) {
        HashSet<Integer> mySet = new HashSet<>();

        System.out.println(mySet.toString());

        mySet.add(11);
        mySet.add(11);
        mySet.add(11);
        mySet.add(21);
        mySet.add(31);
        mySet.add(41);
        System.out.println(mySet.toString());

        mySet.remove(11);
        System.out.println(mySet.toString());
        mySet.remove(1);
        System.out.println(mySet.toString());

        System.out.println(mySet.size());

        System.out.println(mySet.contains(21));

        for (int i : mySet) {
            System.out.println(i);
        }
    }
}
