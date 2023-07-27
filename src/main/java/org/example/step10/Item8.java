package org.example.step10;

import java.util.Scanner;

public class Item8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt();

        if (num1 >= num2 + num3)
            System.out.println(num2 + (num2 + num3 - 1) + num3);
        else if (num2 >= num1 + num3)
            System.out.println(num1 + (num1 + num3 - 1) + num3);
        else if (num3 >= num2 + num1)
            System.out.println(num2 + (num2 + num1 - 1) + num1);
        else
            System.out.println(num1 + num2 + num3);
    }
}
