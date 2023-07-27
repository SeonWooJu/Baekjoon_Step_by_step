package org.example.step2;

import java.util.Scanner;

public class Item6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // h 시간, m 분, 진행 시간
        int h = sc.nextInt(), m = sc.nextInt(), num_m = sc.nextInt();

        if (h < 24 && m < 60) {
            m = m + num_m;
            if (m >= 60) {
                h = h + (m / 60); // 분을 시간으로
                m = m % 60; // 남은 시간
                if (h >= 24) {
                    h = h % 24;
                }
            }
        }

        System.out.println(h + " " + m);
    }
}
