package org.example.step4;

import java.util.Scanner;

public class Item1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        int num = sc.nextInt(), count = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] == num)
                count++;
        }

        System.out.println(count);
    }
}
