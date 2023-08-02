package org.example.step15;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Item3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt(), b1 = sc.nextInt(), a2 = sc.nextInt(), b2 = sc.nextInt();
        int n = ((a1 * b2) + (a2 * b1)), m = (b1 * b2);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 유클리드 호제법 사용
        int num = gcd(n, m);

        // 기약 분수로 만들기 위해 더해진 분자와 분모의 최대 공약수를 구한 후 나누어 준다.
        bw.write(n / num + " " + m / num);

        bw.close();
    }

    public static int gcd(int a, int b) {
        if (a < b) return gcd(b, a);
        else if (b == 0) return a;
        else return gcd(b, a % b);
    }
}
