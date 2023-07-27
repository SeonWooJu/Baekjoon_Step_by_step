package org.example.step1;

import java.util.Scanner;

public class Item6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();

        int number_1 = num_1 + num_2;
        int number_2 = num_1 - num_2;
        int number_3 = num_1 * num_2;
        int number_4 = num_1 / num_2;
        int number_5 = num_1 % num_2;

        System.out.println(number_1);
        System.out.println(number_2);
        System.out.println(number_3);
        System.out.println(number_4);
        System.out.println(number_5);
    }

}
