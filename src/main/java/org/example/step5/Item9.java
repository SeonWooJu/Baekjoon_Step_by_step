package org.example.step5;

import java.util.Scanner;

public class Item9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = 0;

        for (int i = 0; i < 2; i++) {
            String num = sc.next();

            int temp = ((num.charAt(2) - 48) * 100) + ((num.charAt(1) - 48) * 10) + ((num.charAt(0) - 48) * 1);

            if (min < temp)
                min = temp;
        }

        System.out.println(min);
    }
}
