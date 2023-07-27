package org.example.step7;

import java.util.Scanner;

public class Item4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt(), count = 0;
        boolean[][] arr = new boolean[100][100];

        for (int i = 0; i < length; i++) {
            int x = sc.nextInt(), y = sc.nextInt();
            for (int j = y; j < y + 10; j++) {
                for (int k = x; k < x + 10; k++) {
                    arr[j][k] = true;
                }
            }
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (arr[i][j])
                    count++;
            }
        }

        System.out.println(count);
    }
}
