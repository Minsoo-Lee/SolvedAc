package class1.java;

import java.util.Scanner;

public class FindAlpha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }

        String str = scanner.next();

        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a';
            if (arr[index] == -1) {
                arr[index] = i;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
