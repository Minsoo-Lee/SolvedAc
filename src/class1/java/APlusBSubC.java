package class1.java;

import java.util.Scanner;

public class APlusBSubC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        System.out.println(A + B - C);
        System.out.println(Integer.parseInt(String.valueOf(A) + String.valueOf(B)) - C);

        scanner.close();
    }
}
