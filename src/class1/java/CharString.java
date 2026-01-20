package class1.java;

import java.util.Scanner;

public class CharString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();
        int i = scanner.nextInt();

        System.out.println(S.charAt(i - 1));

        scanner.close();
    }
}
