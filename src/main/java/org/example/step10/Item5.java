package org.example.step10;

import java.util.Scanner;

public class Item5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt(), x_min = 10000, x_max = -10000, y_min = 10000, y_max = -10000;
        int[][] arr = new int[length][2];

        // x, y 좌료를 구분하여 받아준다
        for (int i = 0; i < length; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        // x의 최대 값과 최소값, y의 최대 값과 최소값을 구해준다
        // 이 작업이 끝나면 지정된 좌표에 대한 직사각형의 꼭지점이 나온다. (가공된 min(x, y), max(x, y)의 꼭지점은 대각선으로 이어진다.)
        for (int i = 0; i < length; i++) {
            int x = arr[i][0], y = arr[i][1];

            if (x_min >= x)
                x_min = x;
            if (y_min >= y)
                y_min = y;

            if (x_max <= x)
                x_max = x;
            if (y_max <= y)
                y_max = y;
        }

        // 각 좌표의 최대값과 최소값을 빼준 후 곱해주면 넓이가 나온다.
        System.out.print((x_max - x_min) * (y_max - y_min));
    }
}
