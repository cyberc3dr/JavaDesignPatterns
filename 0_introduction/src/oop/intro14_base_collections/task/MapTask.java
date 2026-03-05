package oop.intro14_base_collections.task;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public final class MapTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(char ch : word1.toCharArray()) {
            if(map1.containsKey(ch)) {
                int count = map1.get(ch);

                map1.put(ch, ++count);
            } else {
                map1.put(ch, 1);
            }
        }

        for(char ch : word2.toCharArray()) {
            if(map2.containsKey(ch)) {
                int count = map2.get(ch);

                map2.put(ch, ++count);
            } else {
                map2.put(ch, 1);
            }
        }

        System.out.println(map1.equals(map2) ? "Совпадают" : "Не совпадают");

        scanner.close();
    }
}
