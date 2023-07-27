package org.example.step5;

import java.util.Scanner;

public class Item1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(str.charAt(sc.nextInt() - 1));
    }
}
