package org.example.step11;

import java.util.Scanner;

public class Item4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        // 팩토리얼 사용 n!/((n - 2)! * 2!) = ((n) * (n - 1))/2
        System.out.println((n - 1) * n / 2 + "\n" + 2);
    }
}
