package org.example.step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Item6 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(br.readLine());
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            String[] str = br.readLine().split(" ");
            arr[i] = Integer.parseInt(str[0]) + Integer.parseInt(str[1]);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int num : arr) {
            bw.write(num + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
