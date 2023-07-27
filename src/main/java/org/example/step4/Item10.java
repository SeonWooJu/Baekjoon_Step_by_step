package org.example.step4;

import java.util.Scanner;

public class Item10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] arr = new float[sc.nextInt()];
        float max = 0, temp = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (max < arr[i])
                max = arr[i];
        }

        for (float num : arr) {
            temp += (num / max) * 100;
        }

        System.out.println(temp / arr.length);
    }
}
