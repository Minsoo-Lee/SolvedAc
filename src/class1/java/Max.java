package class1.java;

import java.util.Arrays;
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        int n = 9;

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[n];
        int[] sortArr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sortArr[i] = arr[i];
        }
        Arrays.sort(sortArr);
        int max = sortArr[n - 1];
        System.out.println(max);
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                System.out.println(i + 1);
                break;
            }
        }
        scanner.close();
    }
}
