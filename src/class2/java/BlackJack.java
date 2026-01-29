package class2.java;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        Integer[] arr = new Integer[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum > max && sum <= M) max = sum;
                }
            }
        }
        System.out.println(max);
    }
}
