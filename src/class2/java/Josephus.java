package class2.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Josephus {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        int[] result = new int[N];
        int index = 0;
        K--;

        for (int i = 0; i < N; i++) {
            index += K;
            index %= (N - i);
            Integer x = list.get(index);
            result[i] = x;
            list.remove(index);
        }

        StringBuilder builder = new StringBuilder();
        builder.append("<");
        for (int i = 0; i < result.length; i++) {
            builder.append(result[i]);
            if (i < result.length - 1)
                builder.append(", ");
        }
        builder.append(">");
        System.out.println(builder.toString());
        scanner.close();
    }
}
