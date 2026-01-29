package class2.java;

import java.util.Scanner;

public class Bunhaehab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 1; i < N; i++) {
            int sum = 0;
            int num = i;

            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum + i == N) {
                System.out.println(i);
                scanner.close();
                return ;
            }
        }
        System.out.println(0);
        scanner.close();
    }
}
