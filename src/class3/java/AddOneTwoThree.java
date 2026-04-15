package class3.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;

public class AddOneTwoThree {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] dp = new int[n];
            if (n >= 1) {
                dp[0] = 1;
            } if (n >= 2) {
                dp[1] = 2;
            } if (n >= 3) {
                dp[2] = 4;
            }

            for (int j = 3; j < n; j++) {
                dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
            }
            System.out.println(dp[n - 1]);
        }
    }
}
