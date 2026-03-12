package class3.java;

import java.util.Scanner;

public class Coin0 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int won = scanner.nextInt();

        int[] coins = new int[N];

        for (int i = 0; i < N; i++) {
            coins[i] = scanner.nextInt();
        }

        int index = N - 1;

        int num = 0;
        while (won > 0) {
            if (coins[index] <= won) {
                int coin = coins[index];
                int tmp = won / coin;
                num += tmp;
                won = won - (coin * tmp);
            }
            index--;
        }
        System.out.println(num);
    }
}
