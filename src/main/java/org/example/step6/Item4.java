package org.example.step6;

import java.util.Scanner;

public class Item4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int count = -1, length = str.length() - 1;

        for (int i = 0; i <= length; i++) {
            if (str.charAt(i) != str.charAt(length - i))
                break;
            count++;
        }

        System.out.print(count == length ? 1 : 0);
    }
}
