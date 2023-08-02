package org.example.step15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Item8 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[1000001];

        arr[0] = arr[1] = true;

        // 소수를 구한다. 소수는 false
        // 에라토스테네스의 체 사용
        for (int i = 2; i < Math.sqrt(1000000); i++) {
            if (arr[i]) continue;
            for (int j = i * i; j < 1000001; j += i) {
                arr[j] = true; // 배수들은 소수가 아니기에 true로 변경
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < t; i++) {
            int count = 0;
            int temp = Integer.parseInt(br.readLine());
            // 2부터 시작하는 이유는 0, 1을 배재하기 위해서이다.
            // temp / 2는 현재 입력된 n의 값에 사용된 소수를 찾기 위함이다.
            for (int j = 2; j <= temp / 2; j++) {
                // j가 소수이고, temp - j가 소수이면 count +1
                // 골드바흐의 강한 추측: 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다. (정수 N은 짝수이고, 2 < N ≤ 1,000,000을 만족한다.)
                if (!arr[j] && !arr[temp - j])
                    count++;
            }
            bw.write(count + "\n");
        }

        br.close();
        bw.close();
    }
}
