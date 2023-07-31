package org.example.step14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Item6 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] temp = br.readLine().split(" ");
        int n = Integer.parseInt(temp[0]), m = Integer.parseInt(temp[1]);

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(br.readLine(), i);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<String> list = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String name = br.readLine();

            if (map.get(name) != null)
                list.add(name);
        }

        br.close();

        bw.write(list.size() + "\n");

        Collections.sort(list);

        for (String name : list) {
            bw.write(name + "\n");
        }

        bw.close();
    }
}
