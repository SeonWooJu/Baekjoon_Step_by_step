package org.example.step7;

import java.util.Scanner;

public class Item3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max_length = 0;
        String[] arr = new String[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.next();

            if (arr[i].length() > max_length)
                max_length = arr[i].length();
        }

        for (int i = 0; i < 5; i++) {
            int arr_length = arr[i].length();
            if (arr_length < max_length)
                for (int j = 0; j < (max_length - arr_length); j++) {
                    arr[i] += "_";
                }
        }

        for (int i = 0; i < max_length; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j].charAt(i) != '_')
                    System.out.print(arr[j].charAt(i));
            }
        }
    }
}
