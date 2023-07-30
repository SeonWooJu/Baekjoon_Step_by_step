package org.example.step13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Item10 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[n][2];

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");

            for (int j = 0; j < 2; j++) {
                arr[i][j] = str[j];
            }
        }

        br.close();

        // 나이가 같으면 이름을 사전순으로 정렬하고 같지 않다면 나이순으로 정렬한다.
        Arrays.sort(arr, (s1, s2) -> s1[0] == s2[0] ? s1[1].compareTo(s2[1]) : Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (String[] sarr : arr) {
            for (String s : sarr) {
                bw.write(s + " ");
            }
            bw.write("\n");
        }

        bw.close();
    }
}
