package org.example.step14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Item1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(sc.nextInt(), i);
        }

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print((map.get(sc.nextInt()) == null ? 0 : 1) + " ");
        }
    }
}
