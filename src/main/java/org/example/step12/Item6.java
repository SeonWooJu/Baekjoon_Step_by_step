package org.example.step12;

import java.util.Scanner;

public class Item6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), count = 0;


        // 나누가 5로 끝난다면 5로 만 나눈다
        if (n % 5 != 0)
            // 3이 포함되어 있다면 이 for문이 실행돼며, 3으로 나눈 최소값을 뽑아온다.
            for (int j = 1; j <= 1000; j++) {
                if ((n - (3 * j)) >= 0 && (n - (3 * j)) % 5 == 0) {
                    n -= 3 * j;
                    count += j;
                    break;
                }
            }

        count += n / 5;
        n = n % 5;

        System.out.println(n != 0 ? -1 : count);
    }
}
