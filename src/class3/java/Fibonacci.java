package class3.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
    [0 1]
 0 -> 1 0
 1 -> 0 1
 2 -> 1 1
 3 -> 1 2
 4 -> 2 3
 5 -> 3 5
 6 -> 5 8
 7 -> 8 13

 **/

public class Fibonacci {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringBuilder sb = new StringBuilder();
            int N = Integer.parseInt(br.readLine());

            int[][] arr = {{1, 0}, {0, 1}, {0, 0}};

            for (int j = 2; j <= N; j++) {
                for (int k = 0; k < 2; k++) {
                    arr[2][k] = arr[0][k] + arr[1][k];
                    arr[0][k] = arr[1][k];
                    arr[1][k] = arr[2][k];
                }
            }
            if (N == 0) {
                sb.append("1 0");
            } else if (N == 1) {
                sb.append("0 1");
            } else {
                sb.append(arr[2][0]).append(" ").append(arr[2][1]);
            }
            System.out.println(sb);
        }
    }
}
