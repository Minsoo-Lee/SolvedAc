package class2.java;

import java.util.Scanner;

public class Stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String order = "";
        MyStack myStack = new MyStack();


        for (int i = 0; i < N; i++) {
            order = scanner.nextLine();

            if (order.equals("pop")) {
                System.out.println(myStack.pop());
            } else if (order.equals("size")) {
                System.out.println(myStack.size());
            } else if (order.equals("empty")) {
                System.out.println(myStack.empty());
            } else if (order.equals("top")) {
                System.out.println(myStack.top());
            } else {
                String[] split = order.split(" ");
                myStack.push(Integer.parseInt(split[1]));
            }
        }
        scanner.close();
    }

    public static class MyStack{
        private final java.util.Stack<Integer> stack = new java.util.Stack<>();

        // push X: 정수 X를 스택에 넣는 연산이다.
        public void push(int x) {
            stack.push(x);
        }

        // top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        public int top() {
            if (stack.isEmpty()) return -1;
            return stack.peek();
        }

        // empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
        public int empty() {
            return stack.isEmpty() ? 1 : 0;
        }

        // size: 스택에 들어있는 정수의 개수를 출력한다.
        public int size() {
            return stack.size();
        }

        // pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        public int pop() {
            if (stack.isEmpty()) return -1;
            return stack.pop();
        }
    }
}
