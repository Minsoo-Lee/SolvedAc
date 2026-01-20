package class1.java;

import java.util.Scanner;

public class ADivB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        System.out.println((double) A / B);

        scanner.close();
    }
}
