package org.example.step7;

import java.util.Scanner;

public class Item2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0, x = 0, y = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int num = sc.nextInt();

                if (num >= max) {
                    max = num;
                    x = j + 1;
                    y = i + 1;
                }
            }
        }

        System.out.print(max + "\n" + y + " " + x);
    }
}
