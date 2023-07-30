package org.example.step13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Item11 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n], arr_ = new int[n];
        String[] str = br.readLine().split(" ");
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
            arr_[i] = Integer.parseInt(str[i]);
        }

        br.close();

        Arrays.sort(arr_);
        arr_ = Arrays.stream(arr_).distinct().toArray();

        for (int i = 0; i < arr_.length; i++) {
            if (map.get(arr_[i]) == null)
                map.put(arr_[i], i);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int num : arr) {
            bw.write(map.get(num) + " ");
        }

        bw.close();
    }
}
