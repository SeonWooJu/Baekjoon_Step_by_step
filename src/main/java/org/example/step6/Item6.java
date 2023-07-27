package org.example.step6;

import java.util.Scanner;

public class Item6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int count = 0, num = 0;

        for (int i = 0; i < str.length(); i++) {
            String temp = "";
            for (int j = i; j < str.length(); j++) {
                int num_ = 0;
                temp += str.charAt(j);
                switch (temp) {
                    case "c=":
                    case "c-":
                    case "d-":
                    case "lj":
                    case "nj":
                    case "s=":
                    case "z=":
                        count++;
                        num += 2;
                        num_++;
                        break;
                    case "dz=":
                        count++;
                        num += 3;
                        num_++;
                        break;
                    default:
                        break;
                }
                if (num_ != 0) {
                    i = j;
                    break;
                }
            }
        }

        System.out.println(count + (str.length() - num));
    }
}
