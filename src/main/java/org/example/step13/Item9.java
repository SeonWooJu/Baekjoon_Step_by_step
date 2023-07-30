package org.example.step13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Item9 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        br.close();

        // 문자열의 길이가 같다면 사전순으로 정렬 하도록 람다식을 작성.
        Arrays.sort(arr, (str1, str2) -> str1.length() == str2.length() ? str1.compareTo(str2) : str1.length() - str2.length());
        arr = Arrays.stream(arr).distinct().toArray(String[]::new);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (String str : arr) {
            bw.write(str + "\n");
        }

        bw.close();
    }
}
