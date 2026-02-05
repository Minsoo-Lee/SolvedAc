package class2.java;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class Card2 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }

        while (deque.size() > 1) {
            deque.remove();
            Integer element = deque.remove();
            deque.add(element);
        }
        System.out.println(deque.getFirst());

        scanner.close();
    }
}
