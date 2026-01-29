package class2.java;

import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        String s = sc.next();

        long M = 1234567891L;
        long r = 31L;

        long hash = 0;
        long pow = 1;

        for (int i = 0; i < L; i++) {
            int value = s.charAt(i) - 'a' + 1;
            hash = (hash + value * pow) % M;
            pow = (pow * r) % M;
        }

        System.out.println(hash);
    }
}
