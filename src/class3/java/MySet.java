package class3.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class MySet {

    static boolean[] set = new boolean[21];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            if (cmd.equals("add")) {
                int x = Integer.parseInt(st.nextToken());
                set[x] = true;

            } else if (cmd.equals("remove")) {
                int x = Integer.parseInt(st.nextToken());
                set[x] = false;

            } else if (cmd.equals("check")) {
                int x = Integer.parseInt(st.nextToken());
                sb.append(set[x] ? 1 : 0).append("\n");

            } else if (cmd.equals("toggle")) {
                int x = Integer.parseInt(st.nextToken());
                set[x] = !set[x];

            } else if (cmd.equals("all")) {
                for (int j = 1; j <= 20; j++)
                    set[j] = true;

            } else { // empty
                for (int j = 1; j <= 20; j++)
                    set[j] = false;
            }
        }

        System.out.print(sb);
    }
}