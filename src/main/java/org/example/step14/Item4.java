package org.example.step14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Item4 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] temp = br.readLine().split(" ");
        int n = Integer.parseInt(temp[0]), m = Integer.parseInt(temp[1]);

        Map<String, Integer> map = new HashMap<>();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            map.put(str, i + 1);
            arr[i] = str;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < m; i++) {
            String str = br.readLine();

            if (map.get(str) != null)
                bw.write(map.get(str) + "\n");
            else
                bw.write(arr[Integer.parseInt(str) - 1] + "\n");
        }

        br.close();
        bw.close();
    }
}
