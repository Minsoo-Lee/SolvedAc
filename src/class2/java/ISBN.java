package class2.java;

import java.util.Scanner;

public class ISBN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int index = str.indexOf("*");
        int total = 0;

        for (int i = 0; i < str.length(); i++) {
            if (i == index) continue;
            int weight = i % 2 == 0 ? 1 : 3;
            int x = str.charAt(i) - '0';
            total += (weight * x);
        }

        int result = 0;
        int weight = index % 2 == 0 ? 1 : 3;

        while (total % 10 != 0) {
            result++;
            total += weight;
        }
        System.out.println(result);

        scanner.close();
    }
}
