package class3.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FindPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();

        Map<String, String> strMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String str = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(str);
            String key = st.nextToken();
            String value = st.nextToken();

            strMap.put(key, value);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String site = scanner.nextLine();
            String value = strMap.get(site);
            sb.append(value + "\n");
        }
        System.out.println(sb);
    }
}
