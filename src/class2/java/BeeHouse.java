package class2.java;

import java.util.Scanner;

public class BeeHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int sum = 1;
        int i = 1;
        while (sum < N) {
            sum += i * 6;
            i++;
        }

        System.out.println(i);
    }
}
