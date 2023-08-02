package org.example.step15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Item1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int idx = 0; idx < num; idx++) {
            String[] str = br.readLine().split(" ");
            int n = Integer.parseInt(str[0]), m = Integer.parseInt(str[1]);

            for (int i = 1; ; i++) {
                if ((n * i) % m == 0) {
                    bw.write(m * ((n * i) / m) + "\n");
                    break;
                }
            }
        }

        bw.close();
    }
}
