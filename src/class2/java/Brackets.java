package class2.java;

import java.util.Scanner;
import java.util.Stack;

public class Brackets {
    private static final char open = '(';
    private static final char close = ')';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        int M = scanner.nextInt();

        String[] strArr = new String[M];
        for (int i = 0; i < M; i++) {
            strArr[i] = scanner.next();
        }

        for (int i = 0; i < M; i++) {
            char[] charArray = strArr[i].toCharArray();
            boolean check = true;
            for (char c : charArray) {
                if (c == open) {
                    stack.push(c);
                } else if (c == close) {
                    if (!stack.isEmpty()) {
                        char peek = stack.peek();
                        if (isBracketsMatch(peek, c)) {
                            stack.pop();
                        } else {
                            check = false;   // 짝이 안 맞음
                            break;
                        }
                    } else {
                        check = false;       // 스택 비어있는데 닫힘 괄호
                        break;
                    }
                }
            }
            if (stack.isEmpty() && check) System.out.println("YES");
            else System.out.println("NO");
            stack.removeAllElements();
        }

        scanner.close();
    }

    public static boolean isBracketsMatch(char openBracket, char closeBracket) {
        return open == openBracket && close == closeBracket;
    }
}
