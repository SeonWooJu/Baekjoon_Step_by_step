package org.example.step4;

import java.util.Scanner;

public class Item5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt(), size = sc.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < size; i++) {
            int min = sc.nextInt(), max = sc.nextInt(), num = sc.nextInt();

            for (int j = min - 1; j < max; j++) {
                arr[j] = num;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
