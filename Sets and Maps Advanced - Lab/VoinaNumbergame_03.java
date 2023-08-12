package SetsAndMapsAdvancedLab;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class VoinaNumbergame_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> first = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toList();
        LinkedHashSet<Integer> palyer1 = new LinkedHashSet<>(first);

        List<Integer> second = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toList();


        LinkedHashSet<Integer> player2 = new LinkedHashSet<>(second);

        for (int i = 0; i < 50; i++) {
            if (palyer1.isEmpty()) {
                System.out.println("Second player win!");
                return;
            }
            if (player2.isEmpty()) {
                System.out.println("First player win!");
                return;
            }

            Integer firstCard = getTopCard(palyer1);
            Integer secondCard = getTopCard(player2);

            palyer1.remove(firstCard);
            player2.remove(secondCard);

            if (firstCard > secondCard) {
                palyer1.add(firstCard);
                palyer1.add(secondCard);
            } else if (secondCard > firstCard) {
                player2.add(firstCard);
                player2.add(secondCard);
            } else {
                palyer1.add(firstCard);
                player2.add(secondCard);
            }
        }

        if (palyer1.size() > player2.size()) {
            System.out.println("First player win!");
        } else if (player2.size() > palyer1.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }

    }


    private static Integer getTopCard(LinkedHashSet<Integer> player) {
        for (Integer current : player) {
            return current;
        }
        return 0;
    }
}
