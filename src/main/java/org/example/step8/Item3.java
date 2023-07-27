package org.example.step8;

import java.util.Scanner;

public class Item3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[sc.nextInt()][4];

        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();

            arr[i][0] = num / 25;
            num = num % 25;
            arr[i][1] = num / 10;
            num = num % 10;
            arr[i][2] = num / 5;
            num = num % 5;
            arr[i][3] = num / 1;
            num = num % 1;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
