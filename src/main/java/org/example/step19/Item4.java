package org.example.step19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Item4 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()), n_ = 1, k_ = 1, num_ = 1;

        for (int i = 1; i <= n; i++) {
            if (i <= n)
                n_ *= i;
            if (i <= k)
                k_ *= i;
            if (i <= n - k)
                num_ *= i;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(String.valueOf(n_ / (k_ * num_)));
        bw.close();
    }
}
