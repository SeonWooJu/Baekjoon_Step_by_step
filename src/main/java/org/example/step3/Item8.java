package org.example.step3;

import java.util.Scanner;

public class Item8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int[][] arrs = new int[length][2];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < 2; j++) {
                arrs[i][j] = sc.nextInt();
            }
        }

        for (int i = 0 ; i < length; i++) {
            System.out.println("Case #" + (i + 1) + ": " + arrs[i][0] + " + " + arrs[i][1] + " = " + (arrs[i][0] + arrs[i][1]));
        }
    }
}
