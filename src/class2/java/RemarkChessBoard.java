package class2.java;

import java.util.Arrays;
import java.util.Scanner;

public class RemarkChessBoard {

    private final static char[] charArr = {'B', 'W'};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        char[][] chessBoard = new char[row][col];
        scanner.nextLine();
        for (int i = 0; i < row; i++) {
            String str = scanner.next();
            chessBoard[i] = str.toCharArray();
        }

        int min = 65;

        for (int i = 0; i < row - 7; i++) {
            for (int j = 0; j < col - 7; j++) {
                char[][] charArr = cutArray(chessBoard, i, j);
                int result = findMin(charArr);
                if (result < min) min = result;
            }
        }
        System.out.println(min);
        scanner.close();
    }

    public static char[][] cutArray(char[][] arr, int row, int col) {
        char[][] result = new char[8][8];
        for (int i = row; i < row + 8; i++) {
            System.arraycopy(arr[i], col, result[i - row], 0, col + 8 - col);
        }
        return result;
    }

    public static int findMin(char[][] arr) {
        int result = 0;
        char startChar = arr[0][0];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i % 2 == 0 && j % 2 == 0 && arr[i][j] != startChar) ||
                        (i % 2 == 0 && j % 2 == 1 && arr[i][j] == startChar))
                    result++;
                else if ((i % 2 == 1 && j % 2 == 1 && arr[i][j] != startChar) ||
                        (i % 2 == 1 && j % 2 == 0 && arr[i][j] == startChar))
                    result++;
            }
        }
        return Math.min(result, 64 - result);
    }
}
