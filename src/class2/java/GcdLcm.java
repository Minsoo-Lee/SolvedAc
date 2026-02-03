package class2.java;

import java.util.Scanner;

public class GcdLcm {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(getGCD(a, b));
        System.out.println(getLCM(a, b));

        scanner.close();
    }

    public static int getGCD(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static int getLCM(int a, int b) {
        return (a * b) / getGCD(a, b);
    }
}
