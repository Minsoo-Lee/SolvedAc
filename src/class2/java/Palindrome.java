package class2.java;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        boolean check = true;

        while(n != 0) {
            String str = String.valueOf(n);
            for (int i = 0; i <= str.length() / 2 - 1; i++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

            check = true;

            n = scanner.nextInt();
        }

        scanner.close();
    }
}
