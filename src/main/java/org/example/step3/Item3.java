package org.example.step3;

import java.util.Scanner;

public class Item3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt(), num = 0;

        for (int i = 1; i <= length; i++) {
            num += i;
        }

        System.out.println(num);
    }
}
