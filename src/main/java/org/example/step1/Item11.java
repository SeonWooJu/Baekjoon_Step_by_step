package org.example.step1;

import java.util.Scanner;

public class Item11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num_A = sc.nextLong();
        long num_B = sc.nextLong();
        long num_C = sc.nextLong();

        long number = num_A + num_B + num_C;

        System.out.println(number);
    }

}
