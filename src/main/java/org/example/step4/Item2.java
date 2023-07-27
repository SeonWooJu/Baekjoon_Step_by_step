package org.example.step4;

import java.util.Scanner;

public class Item2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt(), max = sc.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int num : arr) {
            if (num < max)
                System.out.print(num + " ");
        }
    }
}
