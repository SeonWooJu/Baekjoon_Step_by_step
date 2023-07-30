package org.example.step13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Item8 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] temp = br.readLine().split(" ");

            for (int j = 0; j < 2; j++) {
                arr[i][j] = Integer.parseInt(temp[j]);
            }
        }

        br.close();

        Arrays.sort(arr, (o1, o2) -> o1[1] == o2[1] ? o1[0] - o2[0] : o1[1] - o2[1]);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int[] num : arr) {
            for (int m : num) {
                bw.write(m + " ");
            }
            bw.write("\n");
        }

        bw.close();
    }
}
