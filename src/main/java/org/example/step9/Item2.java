package org.example.step9;

import java.util.Scanner;

public class Item2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), k = sc.nextInt(), idx = 0;

        while (k > 0) {
            idx++;
            if (n % idx == 0) {
                k--;
            }

            if (idx > n) {
                idx = 0;
                break;
            }
        }

        System.out.println(idx);
    }
}
