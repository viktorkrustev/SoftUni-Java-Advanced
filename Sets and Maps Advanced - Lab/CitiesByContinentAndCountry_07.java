package SetsAndMapsAdvancedLab;

import java.util.*;

public class CitiesByContinentAndCountry_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String,Map<String, List<String>>> infoMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");
            String continent = data[0];
            String country = data[1];
            String town = data[2];
            if (!infoMap.containsKey(continent)) {
                infoMap.put(continent, new LinkedHashMap<>());
            }
            if (!infoMap.get(continent).containsKey(country)) {
                infoMap.get(continent).put(country, new ArrayList<>());
            }

            infoMap.get(continent).get(country).add(town);
        }
        for (Map.Entry<String, Map<String, List<String>>> continentEntry : infoMap.entrySet()) {
            System.out.println(continentEntry.getKey() + ":");
            for (Map.Entry<String, List<String>> countryEntry : continentEntry.getValue().entrySet()) {
                System.out.println("  " + countryEntry.getKey() + " -> " + String.join(", ", countryEntry.getValue()));
            }
        }
    }
}
