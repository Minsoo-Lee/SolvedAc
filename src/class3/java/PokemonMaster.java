package class3.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PokemonMaster {

    static String[] arr;
    static Map<String, Integer> myMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String firstStr = br.readLine();
        String[] split = firstStr.split(" ");

        int num = Integer.parseInt(split[0]);
        int cases = Integer.parseInt(split[1]);

        int len = num + 1;
        arr = new String[len];
        for (int i = 1; i < len; i++) {
            String pokemon = br.readLine();
            arr[i] = pokemon;
            myMap.put(pokemon, i);
        }

        for (int i = 0; i < cases; i++) {
            String question = br.readLine();
            if (Character.isDigit(question.charAt(0))) {
                int index = Integer.parseInt(question);
                sb.append(arr[index]).append("\n");
            } else {
                sb.append(myMap.get(question)).append("\n");
            }
        }
        System.out.println(sb);
    }
}
