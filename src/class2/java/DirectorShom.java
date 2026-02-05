package class2.java;

import java.util.Scanner;

public class DirectorShom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int movie = 666;
        int count = 1;

        while (N > count) {
            movie++;

            if(String.valueOf(movie).contains("666")){ //666이 들어간 부분을 순서대로
                //만약  666을 포함한다면
                count++;
            }
        }

        System.out.println(movie);
        scanner.close();
    }
}
