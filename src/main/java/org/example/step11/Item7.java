package org.example.step11;

import java.util.Scanner;

public class Item7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt(), a0 = sc.nextInt(), c = sc.nextInt(), n0 = sc.nextInt();

        // "a1 <= c"를 추가한 이유는 a1에 c보다 큰값이 들어가 있으때 n의 input 값이 1일인 경우 1이상의 값으로 바뀌면 답이 달라질 수 있기 때문이다.
        // (n이 바뀌어도 답의 일관성을 유지해야함)
        // n의 값이 달라질 수 있는 이유는 n은 n0 보다 같거나 커야하여 n0 이상의 무한대이기 때문이다.
        // 예) (a1 = 4, a0 = -2, c = 2, n = 1)인 경우 output = 1, n = 2로 바뀌면 output 0
        System.out.println(a1 * n0 + a0 <= c * n0 && a1 <= c ? 1 : 0);
    }
}
