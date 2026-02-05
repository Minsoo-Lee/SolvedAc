package class2.java;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class QueueImpl {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        String order = "";

        MyQueue queue = new MyQueue();
        for (int i = 0; i < N; i++) {
            order = scanner.nextLine();
            System.out.printf("i = " + i + ", ");

            if (order.equals("pop")) {
                System.out.println(queue.pop());
            } else if (order.equals("size")) {
                System.out.println(queue.size());
            } else if (order.equals("empty")) {
                System.out.println(queue.empty());
            } else if (order.equals("front")) {
                System.out.println(queue.front());
            } else if (order.equals("back")) {
                System.out.println(queue.back());
            } else {
                String[] split = order.split(" ");
                queue.push(Integer.parseInt(split[1]));
                System.out.printf(queue.toString());
                System.out.println();
            }
        }
        scanner.close();
    }

    static class MyQueue {
        Deque<Integer> queue = new ArrayDeque<>();

        // push X: 정수 X를 큐에 넣는 연산이다.
        public void push(int x) {
            queue.addLast(x);
        }

        // pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        public int pop() {
            if (queue.isEmpty()) return -1;
            return queue.pollFirst();
        }

        // size: 큐에 들어있는 정수의 개수를 출력한다.
        public int size() {
            return queue.size();
        }

        // empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
        public int empty() {
            return queue.isEmpty() ? 1 : 0;
        }

        // front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        public int front() {
            if (queue.isEmpty()) return -1;
            return queue.getFirst();
        }

        // back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        public int back() {
            if (queue.isEmpty()) return -1;
            return queue.getLast();
        }

        @Override
        public String toString() {
            StringBuilder str = new StringBuilder("[");
            for (Integer i : queue) {
                str.append(i.toString()).append(" ");
            }
            str.append("]");
            return str.toString();
        }
    }
}
