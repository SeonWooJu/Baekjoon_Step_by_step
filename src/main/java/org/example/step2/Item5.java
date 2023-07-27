package org.example.step2;

import java.util.Scanner;

public class Item5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num_h = sc.nextInt();
        int num_m = sc.nextInt();

        if ((0 <= num_h && num_h <= 23) && (0 <= num_m && num_m <= 59)) {   // 시간 체크 if문
            if (0 <= num_m && num_m < 45) {     // 45분 미만 남아 있을 때
                int number = num_m - 45;
                num_h = num_h == 0 ? num_h = 23 : num_h - 1;
                num_m = 60 + number;
                System.out.println(num_h + " " + num_m);
            } else {    // 46분 이상 있을 때
                num_m = num_m - 45;
                System.out.println(num_h + " " + num_m);
            }
        }
    }
}
