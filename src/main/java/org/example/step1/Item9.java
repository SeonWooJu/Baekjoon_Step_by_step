package org.example.step1;

import java.util.Scanner;

public class Item9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num_A = sc.nextInt();
        int num_B = sc.nextInt();
        int num_C = sc.nextInt();

        int number_1 = (num_A + num_B) % num_C;
        int number_2 = ((num_A % num_C) + (num_B % num_C)) % num_C;
        int number_3 = (num_A * num_B) % num_C;
        int number_4 = ((num_A % num_C) * (num_B % num_C)) % num_C;

        System.out.println(number_1);
        System.out.println(number_2);
        System.out.println(number_3);
        System.out.println(number_4);
    }

}
