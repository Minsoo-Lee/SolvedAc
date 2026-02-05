package class2.java;

import java.util.Arrays;
import java.util.Scanner;

public class SortXY {
    static class Position implements Comparable<Position> {
        int x;
        int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Position o) {
            if (this.y == o.y)
                return this.x - o.x;
            return this.y - o.y;
        }

        @Override
        public String toString() {
            return x + " " + y;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        Position[] positions = new Position[N];

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            positions[i] = new Position(x, y);
        }

        Arrays.sort(positions);

        for (Position position : positions) {
            System.out.println(position);
        }
    }
}
