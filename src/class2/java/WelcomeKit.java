package class2.java;

import java.util.Arrays;
import java.util.Scanner;

public class WelcomeKit {
    public static void main(String[] args) {
        int people = 6;
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] size = new int[people];

        for (int i = 0; i < people; i++) {
            size[i] = scanner.nextInt();
        }

        int T = scanner.nextInt();
        int P = scanner.nextInt();

        for (int i = 0; i < people; i++) {
            if (size[i] > 0)
                size[i] = (size[i] - 1) / T + 1;
        }

        System.out.println(Arrays.stream(size).sum());
        System.out.println((N / P) + " " + (N % P));

        scanner.close();
    }
}
