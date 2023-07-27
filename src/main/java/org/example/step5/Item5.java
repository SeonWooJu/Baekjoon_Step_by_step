package org.example.step5;

import java.util.Scanner;

public class Item5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt(), num = 0;
        String str = sc.next();

        for (int i = 0; i < length; i++) {
            num += str.charAt(i) - 48;
        }

        System.out.println(num);
    }
}
