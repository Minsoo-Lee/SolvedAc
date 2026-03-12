package class3.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Nobody {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        scanner.nextLine();

        Set<String> hear = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String str = scanner.nextLine();
            hear.add(str);
        }

        Set<String> see = new HashSet<>();
        for (int i = 0; i < M; i++) {
            String str = scanner.nextLine();
            see.add(str);
        }

        List<String> arr = new ArrayList<>();
        for (String str : see) {
            if (hear.contains(str))
                arr.add(str);
        }

        Collections.sort(arr); // 사전순 정렬

        System.out.println(arr.size()); // 듣보잡 수
        for (String name : arr) {
            System.out.println(name);
        }
    }
}
