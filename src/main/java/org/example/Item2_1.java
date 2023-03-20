package org.example;

import java.util.Scanner;

public class Item2_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num_A = sc.nextInt();
        int num_B = sc.nextInt();

        if (num_A > num_B)
            System.out.println(">");
        if (num_A < num_B)
            System.out.println("<");
        if (num_A == num_B)
            System.out.println("==");
    }

}
