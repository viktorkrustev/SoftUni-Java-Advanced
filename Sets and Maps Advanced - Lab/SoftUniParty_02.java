package SetsAndMapsAdvancedLab;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Set<String> guests = new TreeSet<>();
        while (!input.equals("PARTY")){
            guests.add(input);

            input = scanner.nextLine();
        }

        String str = scanner.nextLine();
        while (!str.equals("END")){
            guests.remove(str);

            str = scanner.nextLine();
        }

        System.out.println(guests.size());
        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}
