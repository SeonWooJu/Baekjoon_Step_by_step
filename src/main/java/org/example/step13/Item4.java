package org.example.step13;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Item4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        br.close();

        // Arrays.sort 보다 Collections.sort 가 더 빠르다.
        Collections.sort(list);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int num : list) {
            bw.write(num + "\n");
        }
        bw.close();
    }
}