package org.example.step8;

import java.util.Scanner;

public class Item4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt(), num = 2;

        for (int i = 0; i < length; i++) {
            num += num - 1;
        }

        System.out.println(num * num);
    }
}
