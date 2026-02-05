package class2.java;

import java.util.Scanner;

public class SortNum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] arr = new int[N];
        int max = -1_000_000;
        int min = 1_000_000;

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            if (x > max) max = x;
            if (x < min) min = x;
            arr[i] = x;
        }

        int[] result = new int[max - min + 1];

        for (int i = 0; i < N; i++) {
            result[arr[i] - min]++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < result.length; i++) {
            while (result[i]-- > 0) {
                sb.append(i + min).append('\n');
            }
        }

        System.out.print(sb);
    }
}