package org.example.step12;

import java.util.Scanner;

public class Item2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = 0, mm = 0;

        for (int i = 1; i < n; i++) {
            String temp = i + "";
            m = i;
            for (int j = 0; j < temp.length() ; j++) {
                m += temp.charAt(j) - 48;
            }

            if (m == n) {
                mm = i;
                break;
            }
        }

        System.out.println(mm);
    }
}
