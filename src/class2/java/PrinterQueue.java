package class2.java;

import java.util.*;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int x = 0; x < T; x++) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();

            Deque<int[]> queue = new ArrayDeque<>();
            for (int i = 0; i < N; i++) {
                int value = scanner.nextInt();
                queue.addLast(new int[]{i, value});
            }

            int count = 0;

            while (!queue.isEmpty()) {
                int[] now = queue.pollFirst();

                boolean hasHigher = false;

                for (int[] q : queue) {
                    if (q[1] > now[1]) {
                        hasHigher = true;
                        break;
                    }
                }

                if (hasHigher) {
                    queue.addLast(now);
                } else {
                    count++;

                    if (now[0] == M) {
                        System.out.println(count);
                        break;
                    }
                }
            }
        }
        scanner.close();
    }
}
