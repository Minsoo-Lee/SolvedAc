package class1.java;

import java.util.Scanner;

public class CheckSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int x = scanner.nextInt();
            sum += (x * x);
        }

        System.out.println(sum % 10);

        scanner.close();
    }
}
