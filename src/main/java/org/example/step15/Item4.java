package org.example.step15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Item4 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(br.readLine());
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int gcd = 0;
        for (int i = 0; i < length - 1; i++) {
            int num = arr[i + 1] - arr[i];
            gcd = gcd(num, gcd);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(((arr[length - 1] - arr[0]) / gcd + 1 - length) + "");
        bw.close();
    }

    public static int gcd(int a, int b) {
        if (b > a) return gcd(b, a);
        else if (b == 0) return a;
        else return gcd(b, a % b);
    }
}
