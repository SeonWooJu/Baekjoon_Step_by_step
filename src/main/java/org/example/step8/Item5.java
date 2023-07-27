package org.example.step8;

import java.util.Scanner;

public class Item5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(), temp = 1, idx = 0;

        while (true) {
            temp += idx * 6;
            idx++;

            if ((temp - (idx * 6)) <= num && num <= temp)
                break;
        }

        System.out.println(idx);
    }
}
