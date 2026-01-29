package class2.java;

import java.util.Scanner;

public class FindPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i < N; i++) {
            int n = scanner.nextInt();
            if (isPrime(n)) sum++;
        }

        System.out.println(sum);
    }

    public static boolean isPrime(int n) {
        double squart = Math.sqrt(n);
        if (n == 1) return false;
        for (int i = 2; i <= squart; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
