package BackTracking;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxSum {
    static String[] menu;
    static int[] price;
    static int limit;
    static int[] visited;
    static ArrayList<String> orderList;
    static int totalPrice;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        menu = new String[] {"치킨", "피자", "족발", "중식", "곱창", "분식", "회"};
        price = new int[] {20_000, 30_000, 40_000, 64_000, 33_000, 24_000, 72_000};
        limit = 150_000;

        visited = new int[menu.length];
        int priceSum = 0;
        ArrayList<String> tempOrder = new ArrayList<>();

        totalPrice = 0;
        orderList = new ArrayList<>();

        order(priceSum, tempOrder);

        System.out.println(orderList);
        System.out.println(totalPrice);
    }

    public static void order(int priceSum, ArrayList<String> tempOrder) {
        if (priceSum > limit) {
            return;
        }
        else if (priceSum <= limit) {
            totalPrice = priceSum;
            orderList = (ArrayList<String>) tempOrder.clone();
        }

        for (int i = 0; i < menu.length; i++) {
            if (visited[i] == 0) {
                tempOrder.add(menu[i]);
                priceSum += price[i];
                visited[i] = 1;
                order(priceSum, tempOrder);
                visited[i] = 0;
                priceSum -= price[i];
                tempOrder.remove(menu[i]);
            }
        }
        return;
    }
}