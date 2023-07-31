package org.example.step14;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Item7 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt(), count = 0;
        Map<Integer, Integer> map1 = new HashMap<>(), map2 = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map1.put(sc.nextInt(), i);
        }

        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();

            map2.put(num, i);

            if (map1.get(num) == null)
                count++;
        }

        for (int num : map1.keySet()) {
            if (map2.get(num) == null)
                count++;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(count + "");

        bw.close();
    }
}
