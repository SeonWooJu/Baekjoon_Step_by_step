package org.example.step4;

import java.util.Scanner;

public class Item4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9], max = new int[2];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max[0]) {
                max[0] = arr[i];
                max[1] = i + 1;
            }
        }

        System.out.println(max[0] + "\n" + max[1]);
    }
}
