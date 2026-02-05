package class2.java;

import java.util.Scanner;

public class FactorialZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int count = 0;

        while (N >= 5) {
            N /= 5;
            count += N;
        }

        System.out.println(count);
    }
}
