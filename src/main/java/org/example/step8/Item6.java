package org.example.step8;

import java.util.Scanner;

public class Item6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y_idx = sc.nextInt(), x_idx = 0;
        String dap = "";

        // 대각선으로 값을 찾아야 하기 때문에 입력받은 값 빼기 x index를 사용하여 값이 위치한 y index를 찾는다.
        // 증감 연산자를 사용하여 입력받은 값이 위치한 x index를 찾는다.
        while ((y_idx - x_idx) > 0) {
            y_idx = y_idx - x_idx;
            x_idx++;
        }

        // x좌표가 짝수이면 위에서 아래로 읽고, 홀수면 아래에서 위로 읽기 때문에 구분해준다.
        if (x_idx % 2 == 0) {
            dap = y_idx + "/" + (x_idx + 1 - y_idx);
        } else {
            dap = (x_idx + 1 - y_idx) + "/" + y_idx;
        }


        System.out.println(dap);
    }
}
