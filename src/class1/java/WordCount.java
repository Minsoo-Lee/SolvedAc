package class1.java;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String strip = str.strip();
        String[] split = strip.split(" ");
        if (str.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(split.length);
        }
    }
}
