package class2.java;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer num = 0;
        int idx = -1;

        for (int i = 0; i < 3; i++) {
            String str = scanner.next();
            if (parseIntOrNull(str) != null) {
                num = parseIntOrNull(str);
                idx = i;
            }
        }

        Integer result = num + (3 - idx);
        System.out.println(isFizBuzz(result));

    }

    public static String isFizBuzz(Integer n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else {
            return n.toString();
        }
    }

    public static Integer parseIntOrNull(String s) {
        try {
            return Integer.parseInt(s);
        } catch (Exception e) {
            return null;
        }
    }
}
