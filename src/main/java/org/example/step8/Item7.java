package org.example.step8;


import java.util.Scanner;

public class Item7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int up = sc.nextInt(), down = sc.nextInt(), height = sc.nextInt();

        if (up >= height)
            System.out.println(1);
        else
            if ((height - up) % (up - down) == 0)
                System.out.println((height - up) / (up - down) + 1);
            else
                System.out.println((height - up) / (up - down) + 2);
    }
}
