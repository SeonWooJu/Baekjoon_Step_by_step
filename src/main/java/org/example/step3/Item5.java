package org.example.step3;

import java.util.Scanner;

public class Item5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 4; i <= num; i += 4) {
            System.out.print("long ");
        }

        System.out.println("int");
    }
}
