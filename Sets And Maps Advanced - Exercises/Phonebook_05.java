package SetsAndMapsAdvancedExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, String> infoMap = new LinkedHashMap<>();

        while (!input.equals("search")){
            String[] tokens = input.split("-");
            String name = tokens[0];
            String number = tokens[1];
            if (!infoMap.containsKey(name)){
                infoMap.put(name, number);
            }


            input = scanner.nextLine();
        }

        String name = scanner.nextLine();
        while (!name.equals("stop")){
            if (name.equals("search")){
                continue;
            } else {
                if (infoMap.containsKey(name)){
                    System.out.printf("%s -> %s\n", name, infoMap.get(name));
                } else {
                    System.out.printf("Contact %s does not exist.\n", name);
                }
            }

            name = scanner.nextLine();
        }
    }
}
