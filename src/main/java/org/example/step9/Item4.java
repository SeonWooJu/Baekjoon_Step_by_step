package org.example.step9;

import java.util.Scanner;

public class Item4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt(), dap = 0;

        for (int i = 0; i < length; i++) {
            int n = sc.nextInt(), count = 0;

            for (int j = 1; j <= n; j++) {
                if (n % j == 0)
                    count++;
            }

            if (count == 2)
                dap++;
        }

        System.out.println(dap);
    }
}
