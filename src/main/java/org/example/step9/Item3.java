package org.example.step9;

import java.util.Scanner;

public class Item3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt(), temp = 1;

            if (n == -1)
                break;

            String str = n + " = 1";

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    temp += i;
                    str += " + " + i;
                }
            }

            if (n == temp)
                System.out.println(str);
            else
                System.out.println(n + " is NOT perfect.");

        }
    }
}
