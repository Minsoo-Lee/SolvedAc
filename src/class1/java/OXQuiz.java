package class1.java;

import java.util.Scanner;

public class OXQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        String[] arr = new String[T];
        int[] total = new int[T];

        for (int i = 0; i < T; i ++) {
            arr[i] = scanner.next();
        }

        for (int i = 0; i < T; i++) {
            int o = 1;
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'O') {
                    total[i] += o;
                    o++;
                } else {
                    o = 1;
                }
            }
        }
        for (int i : total) {
            System.out.println(i);
        }
    }
}

