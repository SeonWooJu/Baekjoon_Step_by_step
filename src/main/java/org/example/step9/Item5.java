package org.example.step9;

import java.util.Scanner;

public class Item5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(), n = sc.nextInt(), sum = 0, min = 0;

        for (int i = m; i <= n; i++) {
            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }

            if (count == 2) {
                sum += i;
                if (min == 0)
                    min = i;
            }
        }

        if (min == 0)
            System.out.println(-1);
        else
        System.out.print(sum + "\n" + min);
    }
}
