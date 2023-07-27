package org.example.step3;

import java.util.Scanner;

public class Item7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt() + sc.nextInt();
        }

        for (int i = 0 ; i < length; i++) {
            System.out.println("Case #" + (i + 1) + ": " + arr[i]);
        }
    }
}
