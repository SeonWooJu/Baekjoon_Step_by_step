package org.example.step9;

import java.util.Scanner;

public class Item6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n != 1) {
            int temp = 0;
            for (int i = 2; ; i++) {
                if (n % i == 0) {
                    temp = i;
                    break;
                }
            }

            n = n / temp;
            System.out.println(temp);
        }
    }
}
