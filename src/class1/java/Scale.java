package class1.java;

import java.util.Scanner;

public class Scale {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[8];

        for (int i = 0; i < 8; i++) {
            arr[i] = scanner.nextInt();
        }

        int before = -1;

        for (int i = 0; i < 7; i++) {
            int after = ifContinue(arr[i], arr[i + 1]);
            if (after == 2) {
                System.out.println("mixed");
                before = 3;
                break;
            }
            if (i > 0 && before != after) {
                System.out.println("mixed");
                before = 3;
                break;
            }
            before = after;
        }

        if (before == 1) {
            System.out.println("ascending");
        } else if (before == 0) {
            System.out.println("descending");
        }
    }

    // 올라가면 1, 내려가면 0, 혼합이면 2
    public static int ifContinue(int x, int y) {
        if ((x == 8 && y == 1) || y - x == 1) {
            return 1;
        } else if ((x == 1 && y == 8) || x - y == 1) {
            return 0;
        } else {
            return 2;
        }
    }
}

