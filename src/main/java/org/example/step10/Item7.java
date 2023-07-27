package org.example.step10;

import java.util.Scanner;

public class Item7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt();

            if (num1 + num2 + num3 == 0)
                break;

            if (num1 >= num2 + num3 || num2 >= num1 + num3 || num3 >= num2 + num1) {
                System.out.println("Invalid");
            } else if (num1 == num2 && num1 == num3 && num2 == num3) {
                System.out.println("Equilateral");
            } else if (num1 == num2 || num1 == num3 || num2 == num3) {
                System.out.println("Isosceles");
            } else if (num1 != num2 && num1 != num3 && num2 != num3) {
                System.out.println("Scalene");
            }
        }
    }
}
