package class2.java;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        float[] arr = new float[N];
        int maxVal = 0;
        int maxIdx = -1;

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            if (x > maxVal) {
                maxVal = x;
                maxIdx = i;
            }
            arr[i] = x;
        }

        for (int i = 0; i < N; i++) {
            arr[i] = (arr[i]/maxVal) * 100;
        }

        float total = 0.0f;
        for (float v : arr) {
            total += v;
        }

        System.out.println(total/N);

        scanner.close();
    }
}
