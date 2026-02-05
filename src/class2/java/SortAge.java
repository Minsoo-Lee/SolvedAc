package class2.java;

import java.util.Arrays;
import java.util.Scanner;

public class SortAge {

    static class User implements Comparable<User> {
        int num;
        int age;
        String name;

        public User(int num, int age, String name) {
            this.num = num;
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(User o) {
            if (this.age == o.age)
                return this.num - o.num;
            return this.age - o.age;
        }

        @Override
        public String toString() {
            return age + " " + name;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        User[] users = new User[N];

        for (int i = 0; i < N; i++) {
            int age = scanner.nextInt();
            String name = scanner.next();
            users[i] = new User(i, age, name);
        }

        Arrays.sort(users);

        for (User user : users) {
            System.out.println(user);
        }
    }
}
