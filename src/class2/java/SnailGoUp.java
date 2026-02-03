package class2.java;

import java.util.Scanner;

public class SnailGoUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int V = scanner.nextInt();

        int days = (int) Math.ceil((double)(V - A) / (A - B)) + 1;

        System.out.println(days);
        scanner.close();
    }
}
