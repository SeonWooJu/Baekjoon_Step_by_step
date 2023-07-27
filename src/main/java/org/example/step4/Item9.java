package org.example.step4;

import java.util.Scanner;

public class Item9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt(), size = sc.nextInt();
        int[] arr = new int[length], arr_ = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = i + 1;
            arr_[i] = i + 1;
        }

        for (int i = 0; i < size; i++) {
            int num1 = sc.nextInt() - 1, num2 = sc.nextInt() - 1, idx = num2;
            for (int j = num1; j <= num2; j++) {
                arr[j] = arr_[idx];
                idx--;
            }
            for (int j = 0; j < arr.length; j++) {
                arr_[j] = arr[j];
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
