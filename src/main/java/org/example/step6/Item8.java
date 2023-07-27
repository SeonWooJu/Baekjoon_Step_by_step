package org.example.step6;

import java.util.Scanner;

public class Item8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float num1 = 0, num2 = 0;

        for (int i = 0; i < 20; i++) {
            String st = sc.next();
            float num = sc.nextFloat();
            String str = sc.next();

            num2 += num;

            switch (str) {
                case "A+":
                    num1 += (float) (4.5 * num);
                    break;
                case "A0":
                    num1 += (float) (4.0 * num);
                    break;
                case "B+":
                    num1 += (float) (3.5 * num);
                    break;
                case "B0":
                    num1 += (float) (3.0 * num);
                    break;
                case "C+":
                    num1 += (float) (2.5 * num);
                    break;
                case "C0":
                    num1 += (float) (2.0 * num);
                    break;
                case "D+":
                    num1 += (float) (1.5 * num);
                    break;
                case "D0":
                    num1 += (float) (1.0 * num);
                    break;
                case "F":
                    num1 += (float) (0.0 * num);
                    break;
                case "P":
                    num1 += (float) (0.0 * num);
                    num2 -= num;
                    break;
            }
        }

        System.out.printf("%.6f", (num1 / num2));
    }
}
