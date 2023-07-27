package org.example.step6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Item7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt(), temp = 0;
        Map<Character, Integer> map = null;

        for (int i = 0; i < length; i++) {
            map = new HashMap<>();
            String str = sc.next();
            int temp_ = 0;

            for (int j = 0; j < str.length(); j++) {
                if (map.get(str.charAt(j)) == null)
                    map.put(str.charAt(j), j);
                else if (j - map.get(str.charAt(j)) > 1) {
                    int count = 0;
                    for (int k = map.get(str.charAt(j)); k <= j; k++) {
                        if (str.charAt(j) == str.charAt(k))
                            count++;
                    }
                    if (count != (j - map.get(str.charAt(j)) + 1))
                        temp_++;
                }

            }
            if (temp_ == 0)
                temp++;
        }

        System.out.println(temp);
    }
}
