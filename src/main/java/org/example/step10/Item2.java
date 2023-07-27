package org.example.step10;

import java.util.Scanner;

public class Item2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(), y = sc.nextInt(), w = sc.nextInt(), h = sc.nextInt(), min = 1000;
        int[] arr = new int[4];

        arr[0] = x;
        arr[1] = y;
        arr[2] = w - x;
        arr[3] = h - y;

        for (int num : arr) {
            if (min >= num)
                min = num;
        }

        System.out.println(min);
    }
}
