package org.example.step14;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Item5 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (map.get(num) == null)
                map.put(num, 1);
            else
                map.put(num, map.get(num) + 1);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();

            bw.write((map.get(num) == null ? 0 : map.get(num)) + " ");
        }

        bw.close();
    }
}
