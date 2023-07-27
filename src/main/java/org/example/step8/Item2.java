package org.example.step8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Item2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(), jinsu = sc.nextInt(), temp = 0;
        List<Integer> list = new ArrayList<>();

        while (num != 0) {
            list.add(num % jinsu);
            num = num / jinsu;
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            temp = list.get(i);
            if (10 <= temp && temp <= 35)
                System.out.print((char) (temp + 55));
            else
                System.out.print(temp);
        }
    }
}
