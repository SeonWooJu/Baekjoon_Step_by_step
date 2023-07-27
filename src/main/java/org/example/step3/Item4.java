package org.example.step3;

import java.util.Scanner;

public class Item4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int don = sc.nextInt(), length = sc.nextInt(), temp = 0;
        int[][] arrs = new int[length][2];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < 2; j++) {
                arrs[i][j] = sc.nextInt();
            }
        }

        for (int[] arr : arrs) {
            temp += arr[0] * arr[1];
        }

        System.out.println(temp == don ? "Yes" : "No");
    }
}
