package org.example.step10;

import java.util.Scanner;

public class Item6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt();

        if (num1 == 60 && num2 == 60 && num3 == 60) {
            System.out.println("Equilateral");
        } else if (num1 + num2 + num3 == 180 && (num1 == num2 || num1 == num3 || num2 == num3)) {
            System.out.println("Isosceles");
        } else if (num1 + num2 + num3 == 180 && (num1 != num2 && num1 != num3 && num2 != num3)) {
            System.out.println("Scalene");
        } else if (num1 + num2 + num3 != 180) {
            System.out.println("Error");
        }
    }
}
