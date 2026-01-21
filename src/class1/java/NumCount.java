package class1.java;

import java.util.Scanner;

public class NumCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int result = A * B * C;

        int[] arr = new int[10];
        String str = String.valueOf(result);

        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - '0';
            arr[index]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }

        scanner.close();
    }
}
