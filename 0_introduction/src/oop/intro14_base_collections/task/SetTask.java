package oop.intro14_base_collections.task;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public final class SetTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> names = new HashSet<>();

        while (true) {
            String name = scanner.nextLine().trim();

            if(name.equalsIgnoreCase("exit")) {
                break;
            }

            names.add(name.toLowerCase());
        }

        System.out.println("Уникальные имена:");

        for(String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}
