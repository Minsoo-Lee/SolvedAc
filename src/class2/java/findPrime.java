package class2.java;

import java.util.Scanner;

public class findPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        for (int i = N; i <= M; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
        scanner.close();
    }

    public static boolean isPrime(int n) {
        int sqrt = (int) Math.sqrt(n);
        if (n == 1) return false;

        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
