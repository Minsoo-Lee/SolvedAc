package class1.java;

import java.util.Scanner;

public class AMultiB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a*b);

        scanner.close();
    }
}
