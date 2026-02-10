package class2.java;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Statistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int avg = (int) Math.round(Arrays.stream(arr).average().orElseThrow());
        System.out.println(avg);

        int[] array = Arrays.stream(arr).sorted().toArray();

        int mid = array[(arr.length - 1) / 2];
        System.out.println(mid);

        int max = Arrays.stream(arr).max().orElseThrow();
        int min = Arrays.stream(arr).min().orElseThrow();

        int range = max - min;

        int[] count = new int[range + 1];

        for (int j : arr) {
            count[j - min]++;
        }

        int second = 0;
        int most_index = -1;

        int most_value = Arrays.stream(count).max().orElseThrow();

        for (int i = 0; i < count.length; i++) {
            if (count[i] == most_value) {
                second++;
                most_index = i;
                if (second == 2) {
                    break;
                }
            }
        }

        System.out.println(most_index + min);

        System.out.println(range);

        scanner.close();
    }
}
