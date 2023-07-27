package org.example.step4;

import java.util.Scanner;

public class Item6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt(), size = sc.nextInt(), temp = 0;
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < size; i++) {
            int num1 = sc.nextInt(), num2 = sc.nextInt();

            temp = arr[num1 - 1];
            arr[num1 - 1] = arr[num2 - 1];
            arr[num2 - 1] = temp;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
