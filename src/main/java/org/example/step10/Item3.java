package org.example.step10;

import java.util.Scanner;

public class Item3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start1 = sc.nextInt(), start2 = sc.nextInt();
        int num1 = sc.nextInt(), num2 = sc.nextInt();
        int num3 = sc.nextInt(), num4 = sc.nextInt();

        if (start1 == num1)
            System.out.print(num3 + " ");
        else if (start1 == num3)
            System.out.print(num1 + " ");
        else if (num1 == num3)
            System.out.print(start1 + " ");

        if (start2 == num2)
            System.out.print(num4);
        else if (start2 == num4)
            System.out.print(num2);
        else if (num2 == num4)
            System.out.print(start2);
    }
}
