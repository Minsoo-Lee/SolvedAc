package class2.java;

import java.util.Scanner;
import java.util.Stack;

public class StackSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();   // 개수 입력
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int nextPush = 1;

        for (int i = 0; i < n; i++) {
            int target = scanner.nextInt();

            // target까지 push
            while (nextPush <= target) {
                stack.push(nextPush++);
                sb.append("+\n");
            }

            // 스택 top 확인
            if (!stack.isEmpty() && stack.peek() == target) {
                stack.pop();
                sb.append("-\n");
            } else {
                System.out.println("NO");
                return;
            }
        }

        System.out.println(sb);

        scanner.close();
    }
}