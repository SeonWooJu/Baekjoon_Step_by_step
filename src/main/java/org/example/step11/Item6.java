package org.example.step11;

import java.util.Scanner;

public class Item6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        // 팩토리얼 사용 n!/((n - 3)! * 3!) = ((n) * (n - 1) * (n - 1))/6
        System.out.println((n - 2) * (n - 1) * n / 6 + "\n" + 3);
    }
}
