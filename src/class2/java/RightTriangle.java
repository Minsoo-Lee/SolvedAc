package class2.java;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.*;

public class RightTriangle {
    public static void main(String[] args) {
        int LENGTH = 3;
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[LENGTH];

        while (true) {
            boolean isEnd = true;

            for (int i = 0; i < LENGTH; i++) {
                arr[i] = scanner.nextInt();
                if (arr[i] != 0) isEnd = false;
            }
            if (isEnd) break;

            Arrays.sort(arr);

            if (pow(arr[0], 2) + pow(arr[1], 2) == pow(arr[2], 2)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }

        scanner.close();
    }
}
