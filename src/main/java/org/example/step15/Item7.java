package org.example.step15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Item7 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder query = new StringBuilder();
        BigInteger bi = null;

        int n = 0, count = 0;
        int[] arr = new int[123456 * 2];

        // 소수를 입력이 들어올때마다 구하면 시간 초과가 출력되는 문제이다.
        for (int i = 0; i < 123456 * 2; i++) {
            bi = BigInteger.valueOf(i + 1);

            if (bi.isProbablePrime(10))
                arr[i] = i + 1;
        }

        while (true) {
            n = Integer.parseInt(br.readLine());
            count = 0;

            if (n == 0)
                break;

            for (int i = n; i <= (2 * n) - 1; i++) {
                if (arr[i] != 0)
                    count++;
            }

            query.append(count);
            query.append("\n");
        }

        br.close();
        bw.write(query.toString());
        bw.close();
    }
}
