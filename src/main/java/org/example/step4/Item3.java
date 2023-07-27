package org.example.step4;

import java.util.Scanner;

public class Item3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt(), min = 1000000, max = -1000000, num = 0;

        for (int i = 0; i < length; i++) {
            num = sc.nextInt();

            if (num >= max)
                max = num;
            if (num <= min)
                min = num;
        }

        System.out.print(min + " " + max);
    }
}