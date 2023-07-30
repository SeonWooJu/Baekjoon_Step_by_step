package org.example.step12;

import java.util.Scanner;

public class Item4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt(), count = 0, min_count = 65;
        char[][] arr = new char[n][m];
        char temp;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().toCharArray();
        }

        // 입력된 체스판의 크기를 8 x 8로 잘라서 사용하기 때문에 4중 for문 사용한다.
        for (int k = 0; k < n - 7; k++) {
            for (int l = 0; l < m - 7; l++) {
                count = 0;
                // 8 x 8로 잘린 체스판에 수정해야 할 부분을 찾는 for문.
                for (int i = k; i < k + 8; i++) {
                    for (int j = l; j < l + 8; j++) {
                        if ((i + 1) % 2 == 0) {
                            if ((j + 1) % 2 == 0)
                                temp = 'W';
                            else
                                temp = 'B';
                        } else {
                            if ((j + 1) % 2 == 0)
                                temp = 'B';
                            else
                                temp = 'W';
                        }

                        // 수정해야할 부분이 몇개인지 찾아야 하기 때문에 if문 사용한다.
                        if (arr[i][j] != temp)
                            count++;
                    }
                }

                // 8 x 8 = 64의 값과 count를 빼는 이유는 위 for문의 count는 첫째 줄은 검/힌, 두번째는 힌/검 식으로 배열된 체스판에서 잘못된걸 찾기때문이다.
                // 밑의 if 문을 통해 천째 줄은 힌/검, 두번째는 검/힌 식으로 배열된 체스판에서 잘못된걸 찾기 때문이다.
                // 첫번째 조건의 체스판 보다, 두번째 조건의 체스판이 더 작으면 그 내용을 count에 할당한다.
                if (count > (64 - count))
                    count = 64 - count;

                // 가장 작은 수정이 일어나는 체스판을 찾기위한 if문
                if (count < min_count)
                    min_count = count;
            }
        }

        System.out.println(min_count);
    }
}
