package class3.java;

import java.util.Scanner;

public class OrganicCabbage {

    static int[][] farm;
    static boolean[][] visit;
    static int M, N;

    // 상하좌우 이동
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            M = scanner.nextInt();
            N = scanner.nextInt();
            int cabbageNum = scanner.nextInt();

            farm = new int[N][M];
            visit = new boolean[N][M];

            for (int j = 0; j < cabbageNum; j++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                farm[y][x] = 1;
            }

            int result = 0;

            // 전체 탐색
            for (int y = 0; y < N; y++) {
                for (int x = 0; x < M; x++) {
                    if (farm[y][x] == 1 && !visit[y][x]) {
                        dfs(x, y);
                        result++;
                    }
                }
            }
            System.out.println(result);
        }
    }

    public static void dfs(int x, int y) {
        visit[y][x] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 범위 체크
            if (nx >= 0 && nx < M && ny >= 0 && ny < N) {
                if (farm[ny][nx] == 1 && !visit[ny][nx]) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
