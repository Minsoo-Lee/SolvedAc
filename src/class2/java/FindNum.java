package class2.java;

import java.util.Arrays;
import java.util.Scanner;

public class FindNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arrN = new int[N];
        for (int i = 0; i < N; i++) {
            arrN[i] = scanner.nextInt();
        }

        int M = scanner.nextInt();
        int[] arrM = new int[M];
        for (int i = 0; i < M; i++) {
            arrM[i] = scanner.nextInt();
        }

        Arrays.sort(arrN);
        for (int i = 0; i < M; i++) {
            System.out.println(binarySearch(arrN, 0, N - 1, arrM[i]));
        }

        scanner.close();
    }

    public static int binarySearch(int[] arr, int start, int end, int num) {
        if (start > end) return 0;

        int mid = (end + start) / 2;
        if (num < arr[mid]) return binarySearch(arr, start, mid - 1, num);
        else if (num > arr[mid]) return binarySearch(arr, mid + 1, end, num);
        else return 1;
    }
}
