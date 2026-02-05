package class2.java;

import java.io.*;
import java.util.*;

public class SolvedAc {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N == 0) {
            System.out.println(0);
            return;
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        int cut = (int) Math.round(N * 0.15);

        int total = 0;
        for (int i = cut; i < N - cut; i++) {
            total += list.get(i);
        }

        int size = N - (cut * 2);
        System.out.println((int) Math.round((double) total / size));
    }
}