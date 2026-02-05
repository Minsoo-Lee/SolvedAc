package class2.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WordSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        Set<String> result = new HashSet<>();

        for (int i = 0; i < N; i++) {
            result.add(scanner.next());
        }

        String[] strArr = result.toArray(String[]::new);
        N = strArr.length;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (strArr[i].length() > strArr[j].length()) {
                    swap(strArr, i, j);
                } else if (strArr[i].length() == strArr[j].length()) {
                    if (strArr[i].compareTo(strArr[j]) > 0) {
                        swap(strArr, i, j);
                    }
                }
            }
        }

        for (String s : strArr) {
            System.out.println(s);
        }
        scanner.close();
    }

    public static boolean ifContains(String[] arr, String s) {
        for (String string : arr) {
            if (string.equals(s)) return true;
        }
        return false;
    }

    public static void swap(String[] arr, int a, int b) {
        String tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
