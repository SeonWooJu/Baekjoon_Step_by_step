package org.example.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Item8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int count = str.split(" ").length;

        if (count != 0 && str.charAt(0) == 32)
            count--;

        System.out.println(count);
    }
}
