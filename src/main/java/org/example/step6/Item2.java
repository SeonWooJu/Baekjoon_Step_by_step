package org.example.step6;

import java.util.Scanner;

public class Item2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < 6; i++) {
            System.out.print((arr[i] - sc.nextInt()) + " ");
        }
    }
}
