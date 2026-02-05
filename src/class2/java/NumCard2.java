package class2.java;

import java.util.Scanner;

public class NumCard2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arrN = setArray(N, scanner);

        int M = scanner.nextInt();
        int[] arrM = setArray(M, scanner);

        // 최소값, 최대값 찾기
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int n : arrN) {
            if (n < min) min = n;
            if (n > max) max = n;
        }

        // 카운팅 배열 생성
        int length = max - min + 1;
        int[] count = new int[length];

        for (int n : arrN) {
            count[n - min]++;
        }

        // 결과 출력
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int idx = arrM[i] - min;

            // 범위 체크
            if (idx >= 0 && idx < length) {
                sb.append(count[idx]).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }

        System.out.println(sb);

        scanner.close();
    }

    public static int[] setArray(int length, Scanner scanner) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
}