package class2.java;

import java.util.Scanner;

public class BunyeoCaptain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int x = 0; x < T; x++) {
            int k = scanner.nextInt();
            int n = scanner.nextInt();

            if (k == 0) {
                System.out.println(n);
                continue;
            }

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = i + 1;
            }

            for (int j = 0; j < k; j++) {
                for (int i = 1; i < n; i++) {
                    arr[i] = arr[i - 1] + arr[i];
                }
            }
            System.out.println(arr[arr.length - 1]);
        }
        scanner.close();
    }
}
