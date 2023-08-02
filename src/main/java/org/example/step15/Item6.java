package org.example.step15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Item6 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        long n = Long.parseLong(str[0]), m = Long.parseLong(str[1]);

        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (long i = n; i <= m; i++) {
            BigInteger bt = BigInteger.valueOf(i);
            if (bt.isProbablePrime(10))
                bw.write(bt + "\n");
        }

        bw.close();
    }
}
