package class2.java;

import java.util.Scanner;

public class Size {

    static class Member {
        int weight;
        int height;

        Member(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Member[] members = new Member[N];
        int[] rank = new int[N];

        for (int i = 0; i < N; i++) {
            members[i] = new Member(sc.nextInt(), sc.nextInt());
            rank[i] = 1;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                if (members[j].weight > members[i].weight &&
                        members[j].height > members[i].height) {

                    rank[i]++;
                }
            }
        }

        for (int r : rank) {
            System.out.print(r + " ");
        }

        sc.close();
    }
}
