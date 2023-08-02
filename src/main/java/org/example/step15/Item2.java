package org.example.step15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Item2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        long n = Long.parseLong(str[0]), m = Long.parseLong(str[1]);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 1; ; i++) {
            if ((n * i) % m == 0) {
                bw.write(m * ((n * i) / m) + "");
                break;
            }
        }

        bw.close();
    }
}
