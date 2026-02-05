package class2.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class BalancedWorld {
    private static final char[] openBrackets = {'[', '('};
    private static final char[] closeBrackets = {']', ')'};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;



        while (!(line = scanner.nextLine()).equals(".")) {
            Stack<Character> stack = new Stack<>();
            char[] charArray = line.toCharArray();
            boolean check = true;
            for (char c : charArray) {
                if (c == openBrackets[0] || c == openBrackets[1]) {
                    stack.push(c);
                } else if (c == closeBrackets[0] || c == closeBrackets[1]) {
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
            if (stack.isEmpty() && check) System.out.println("yes");
            else System.out.println("no");
        }
        scanner.close();
    }

    public static boolean isBracketsMatch(char open, char close) {
        if (open == openBrackets[0] && close == closeBrackets[0]) return true;
        else return open == openBrackets[1] && close == closeBrackets[1];
    }
}
