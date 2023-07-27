package org.example.step4;

import java.util.Scanner;

public class Item8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt() % 42;
        }

        int count, temp = 0;

        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] != arr[j] && i != j)
                    count++;
            }
            if (count == arr.length - i - 1)
                temp++;
        }

        System.out.println(temp);
    }
}
