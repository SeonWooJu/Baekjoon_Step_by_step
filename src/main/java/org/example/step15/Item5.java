package org.example.step15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Item5 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long t = Long.parseLong(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (long i = 0; i < t; i++) {
            BigInteger n = BigInteger.valueOf(Long.parseLong(br.readLine()));

            // BigInteger의 isProbableprime(10)은 소수를 판별할때 사용한다.
            // 현재의 값이 소수면 그대로 출력
            if (n.isProbablePrime(10))
                bw.write(n + "\n");
            // 현재의 값이 소수가 아니라면 현재의 다음 소수를 출력한다.
            else
                bw.write(n.nextProbablePrime() + "\n");
        }

        br.close();
        bw.close();
    }
}
