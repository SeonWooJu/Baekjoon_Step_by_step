package org.example.step9;

import java.util.Scanner;

public class Item1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int num1 = sc.nextInt(), num2 = sc.nextInt();

            if (num1 + num2 == 0)
                break;

            if (num2 % num1 == 0)
                System.out.println("factor");
            else if (num1 % num2 == 0)
                System.out.println("multiple");
            else
                System.out.println("neither");
        }

    }
}