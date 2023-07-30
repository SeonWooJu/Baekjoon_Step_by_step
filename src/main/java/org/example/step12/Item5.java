package org.example.step12;

import java.util.Scanner;

public class Item5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), num = 666, count = 0;
        String str = "";

        while (true) {
            str = num + "";

            for (int i = 0; i < str.length() - 2; i++) {
                if (str.charAt(i) == '6' && str.charAt(i + 1) == '6' && str.charAt(i + 2) == '6') {
                    count++;
                    break;
                }
            }

            if (count == n) {
                break;
            }

            num++;
        }

        System.out.println(str);
    }
}
