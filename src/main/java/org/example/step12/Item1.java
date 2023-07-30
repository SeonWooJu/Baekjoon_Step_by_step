package org.example.step12;

import java.util.Scanner;

public class Item1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt(), sum = 0, max = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 카드의 조합은 꼭 3장을 사용해 하기 때문에 3중 for문(n^3)을 사용하여 값을 뽑아낸다.
        // 2번째, 3번째 for문에 이전 값에 +1 을 한 이유는 중복값 카드로 조합이 되지 않도록 하기 위함이다.
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    sum = arr[i] + arr[j] + arr[k];

                    if (max <= sum && sum <= m) {
                        max = sum;
                    }
                }
            }
        }

        System.out.println(max);
    }
}
