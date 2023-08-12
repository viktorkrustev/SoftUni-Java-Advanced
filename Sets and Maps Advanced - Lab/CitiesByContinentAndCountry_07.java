package SetsAndMapsAdvancedLab;

import javax.net.ssl.SSLContext;
import java.util.*;

public class CitiesByContinentAndCountry_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> continentCountryMap = new LinkedHashMap<>();
        Map<String, List<String>> continentTownsMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");
            String continent = data[0];
            String country = data[1];
            String town = data[2];
            if (!continentCountryMap.containsKey(continent)){
                continentCountryMap.put(continent, new ArrayList<>());
                continentCountryMap.get(continent).add(country);
                continentTownsMap.put(continent, new ArrayList<>());
                continentTownsMap.get(continent).add(town);
            } else {
                continentTownsMap.get(continent).add(town);
                continentCountryMap.get(continent).add(country);
            }
        }

        for (Map.Entry<String, List<String>> entry : continentCountryMap.entrySet()) {
            System.out.println(entry.getKey() + ":");

            List<String> countries = entry.getValue();
            List<String> towns = continentTownsMap.get(entry.getKey());

                System.out.printf("  %s -> ", entry.getValue());
                for (int j = 0; j < towns.size(); j++) {
                    System.out.print(String.join(", ", towns.get(j)));
                }
                System.out.println();
        }
    }

}
