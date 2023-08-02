package org.example.step19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Item5 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine(), " ");

            int k = Integer.parseInt(stk.nextToken()), n = Integer.parseInt(stk.nextToken());

            // k!, n! 팩토리얼을 진행할 시 값이 초과될 수 있어 BigInteger 사용
            BigInteger k_ = BigInteger.ONE, n_ = BigInteger.ONE, num_ = BigInteger.ONE;

            for (int j = 1; j <= n; j++) {
                if (j <= k)
                    k_ = k_.multiply(BigInteger.valueOf(j));
                if (j <= n)
                    n_ = n_.multiply(BigInteger.valueOf(j));
                if (j <= n - k)
                    num_ = num_.multiply(BigInteger.valueOf(j));
            }

            bw.write(n_.divide(k_.multiply(num_)) + "\n");
        }

        br.close();
        bw.close();
    }
}
