package class3.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        int result = 0;
        int index = 0;
        int x = N;
        while (index < N) {
            result += (arr[index] * x);
            index++;
            x--;
        }

        System.out.println(result);
    }
}
