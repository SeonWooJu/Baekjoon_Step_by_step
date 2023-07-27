package org.example.step3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Item11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while (true) {
            int num1 = sc.nextInt(), num2 = sc.nextInt();

            if (num1 != 0 && num2 != 0)
                list.add(num1 + num2);
            else
                break;
        }

        for (int num : list) {
            System.out.println(num);
        }
    }
}
