package Set;

import java.util.Random;
import java.util.HashSet;
public class ex {
    public static void main(String[] args) {
        Random r = new Random();

        HashSet<Integer> set = new HashSet<>();
        for (int cnt = 1; cnt < 6; cnt++) {
            while(set.size() < 6) {
                int num = r.nextInt(45);
                set.add(num + 1);
            }
            System.out.println(cnt + " : " + set.toString());
            set = new HashSet<>();
        }

    }
}
