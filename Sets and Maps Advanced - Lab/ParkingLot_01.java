package SetsAndMapsAdvancedLab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Set<String> set = new LinkedHashSet<>();
        while (!input.equals("END")){
            String[] data = input.split(", ");
            String command = data[0];
            String number = data[1];
            if (command.equals("IN")){
                set.add(number);
            } else {
                set.remove(number);
            }

            input = scanner.nextLine();
        }

        if (set.isEmpty()){
            System.out.println("Parking Lot is Empty");
        } else {
            for (String s : set) {
                System.out.println(s);
            }
        }
    }
}
