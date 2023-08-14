package SetsAndMapsAdvancedExercises;

import java.util.*;

public class HandsOfCards_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, LinkedHashSet<String>> infoMap = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("JOKER")){
            String[] tokens = input.split(": ");
            String name = tokens[0];
            String[] cards = tokens[1].split(", ");
            if (!infoMap.containsKey(name)){
                infoMap.put(name, new LinkedHashSet<>());
                for (String card: cards) {
                    infoMap.get(name).add(card);
                }
            } else {
                for (String card: cards) {
                    infoMap.get(name).add(card);
                }
            }

            input = scanner.nextLine();
        }
        for (Map.Entry<String, LinkedHashSet<String>> entry : infoMap.entrySet()) {
            String name = entry.getKey();
            Set<String> cards = entry.getValue();
            int points = calculatePower(cards);
            System.out.printf("%s: %d%n", name, points);
        }

        
    }
    public static int calculatePower(Set<String> cards){
        int sum = 0;
        Map<Character, Integer> symbolsValue = getSymbolsValues();

        for (String card:cards){
            if (card.startsWith("10")){
                char type = card.charAt(2);
                sum += 10 * symbolsValue.get(type);

            } else {
                char power = card.charAt(0);
                char type = card.charAt(1);
                sum += symbolsValue.get(power) * symbolsValue.get(type);
            }
        }
        return sum;
    }

    public static Map<Character, Integer> getSymbolsValues(){
        Map<Character, Integer> symbolsValuesMap = new HashMap<>();
        symbolsValuesMap.put('2', 2);
        symbolsValuesMap.put('3', 3);
        symbolsValuesMap.put('4', 4);
        symbolsValuesMap.put('5', 5);
        symbolsValuesMap.put('6', 6);
        symbolsValuesMap.put('7', 7);
        symbolsValuesMap.put('8', 8);
        symbolsValuesMap.put('9', 9);
        symbolsValuesMap.put('J', 11);
        symbolsValuesMap.put('Q', 12);
        symbolsValuesMap.put('K', 13);
        symbolsValuesMap.put('A', 14);
        symbolsValuesMap.put('S', 4);
        symbolsValuesMap.put('H', 3);
        symbolsValuesMap.put('D', 2);
        symbolsValuesMap.put('C', 1);
        return  symbolsValuesMap;
    }
}
