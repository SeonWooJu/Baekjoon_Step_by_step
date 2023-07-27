package org.example.step8;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Item6_light_speed_version {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int y_idx = Integer.parseInt(br.readLine()), x_idx = 0;
        br.close();

        while ((y_idx - x_idx) > 0) {
            y_idx = y_idx - x_idx;
            x_idx++;
        }

        StringBuilder sb = new StringBuilder();

        if (x_idx % 2 == 0) {
            sb.append(y_idx).append('/').append(x_idx + 1 - y_idx);
        } else {
            sb.append(x_idx + 1 - y_idx).append('/').append(y_idx);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());

        bw.close();
    }
}
