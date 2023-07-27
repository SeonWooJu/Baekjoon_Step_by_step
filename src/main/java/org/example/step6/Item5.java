package org.example.step6;

import java.util.Scanner;

public class Item5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int count = 0, idx = 0;
        int[] arr = new int[26];

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);

                if (c == (i + 65) || c == (i + 97))
                    arr[i]++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] > 1 && arr[i] > arr[idx])
                idx = i;
        }

        for (int i = 0; i < 26; i++) {
            if (i != idx && arr[i] == arr[idx])
                break;
            count++;
        }

        if (str.length() > 1)
            System.out.println((char) (count == 26 ? idx + 65 : '?'));
        else
            System.out.println((str.charAt(0) + "").toUpperCase());
    }
}
