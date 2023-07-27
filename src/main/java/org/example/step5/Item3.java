package org.example.step5;

import java.util.Scanner;

public class Item3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();

        for (int i = 0; i < length; i++) {
            String str = sc.next();

            if (str.length() == 1)
                System.out.println(str + str);
            else
                System.out.println(str.charAt(0) + "" + str.charAt(str.length() - 1));
        }
    }
}
