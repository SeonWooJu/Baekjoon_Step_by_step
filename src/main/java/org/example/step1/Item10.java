package org.example.step1;

import java.util.Scanner;

public class Item10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num_A = sc.nextInt();
        int num_B = sc.nextInt();

        int num_1 = ((num_B % 100) % 10) / 1;
        int num_2 = (num_B % 100) / 10;
        int num_3 = num_B / 100;


        int number_1 = num_A * num_1;
        int number_2 = num_A * num_2;
        int number_3 = num_A * num_3;

        int number_4 = num_A * num_B;

        System.out.println(number_1);
        System.out.println(number_2);
        System.out.println(number_3);
        System.out.println(number_4);
    }

}
