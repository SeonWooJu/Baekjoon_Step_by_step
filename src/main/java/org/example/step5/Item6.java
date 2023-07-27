package org.example.step5;

import java.util.Scanner;

public class Item6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int[] arr = new int[26];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (arr[c - 97] == -1)
                arr[c - 97] = i;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
