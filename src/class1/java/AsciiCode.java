package class1.java;

import java.util.Scanner;

public class AsciiCode {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char a = scanner.next().charAt(0);

        System.out.println((int) a);

        scanner.close();
    }
}
