package class1.java;

import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        int n = 10;
        int len = 42;
        int[] arr = new int[len];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            arr[x % len]++;
        }

        int sum = 0;
        for (int i : arr) {
            if (i > 0) sum++;
        }
        System.out.println(sum);
        scanner.close();
    }
}
