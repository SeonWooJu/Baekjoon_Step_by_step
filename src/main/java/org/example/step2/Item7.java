package org.example.step2;

import java.util.Scanner;

public class Item7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt(), value = 0;

        if (num1 == num2 && num1 == num3 && num2 == num3)
            value = 10000 + num1 * 1000;
        else if (num1 == num2 || num1 == num3)
            value = 1000 + num1 * 100;
        else if (num2 == num3)
            value = 1000 + num2 * 100;
        else if (num1 >= num2 && num1 >= num3)
            value = num1 * 100;
        else if (num2 >= num1 && num2 >= num3)
            value = num2 * 100;
        else if (num3 >= num1 && num3 >= num2)
            value = num3 * 100;

        System.out.println(value);
    }
}