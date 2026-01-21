package class1.java;

import java.util.Scanner;

public class AlarmClock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();

        m -= 45;
        h = m < 0 ? (h == 0 ? 23 : h - 1) : h;
        m = m < 0 ? 60 + m : m;
        System.out.println(h + " " + m);

        scanner.close();
    }
}
