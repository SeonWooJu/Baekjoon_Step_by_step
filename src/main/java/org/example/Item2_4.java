package org.example;

import java.util.Scanner;

public class Item2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num_x = sc.nextInt();
        int num_y = sc.nextInt();

        // Quadrant
        if (0 < num_x && num_x <= 1000) {
            if (0 < num_y && num_y <= 1000)         // Quadrant 1 
                System.out.println("1");
            else if (0 > num_y && num_y >= -1000)   // Quadrant 4
                System.out.println("4");
        }
        else if (0 > num_x && num_x >= -1000) {
            if (0 < num_y && num_y <= 1000)         // Quadrant 2
                System.out.println("2");
            else if (0 > num_y && num_y >= -1000)   // Quadrant 3
                System.out.println("3");
        }
    }
}
