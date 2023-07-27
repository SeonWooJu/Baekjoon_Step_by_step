package org.example.step8;

import java.util.Scanner;

public class Item1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int num = sc.nextInt(), temp = 0, length = str.length() - 1;

        for (int i = 0; i <= length; i++) {
            char c = str.charAt(i);
            if (48 <= c && c <= 57)
                temp += (c - 48) * Math.pow(num, (length - i));
            else
                temp += (c - 55) * Math.pow(num, (length - i));
        }

        System.out.println(temp);
    }
}
