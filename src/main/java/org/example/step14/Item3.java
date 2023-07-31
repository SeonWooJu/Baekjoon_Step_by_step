package org.example.step14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Item3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] temp = br.readLine().split(" ");
            map.put(temp[0], temp[1]);
        }

        br.close();

        List<String> list = new ArrayList<>();
        for (String name : map.keySet()) {
            if ("enter".equals(map.get(name)))
                list.add(name);
        }

        Collections.sort(list, Collections.reverseOrder());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (String name : list) {
            bw.write(name + "\n");
        }

        bw.close();
    }
}
