package class1.java;

import java.util.Scanner;

public class SmallerThanX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int X = scanner.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i : arr) {
            if (i < X) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
