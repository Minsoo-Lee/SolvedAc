package class2.java;

import java.util.Scanner;
import java.util.Stack;

public class Zero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < M; i++) {
            int n = scanner.nextInt();
            if (n == 0) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(n);
            }
        }
        if (stack.isEmpty()) System.out.println(0);
        else {
            int total = 0;
            for (Integer i : stack) {
                total += i;
            }
            System.out.println(total);
        }
        scanner.close();
    }
}
