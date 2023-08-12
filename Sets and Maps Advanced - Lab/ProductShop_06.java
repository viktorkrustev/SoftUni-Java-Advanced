package SetsAndMapsAdvancedLab;

import com.sun.source.tree.Tree;

import java.util.*;

public class ProductShop_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> productMap = new TreeMap<>();
        Map<String, List<Double>> priceMap = new TreeMap<>();

        String input = scanner.nextLine();

        while (!input.equals("Revision")){
            String[] tokens = input.split(", ");
            String name = tokens[0];
            String product = tokens[1];
            double price = Double.parseDouble(tokens[2]);

            if (!productMap.containsKey(name)){
                productMap.put(name, new ArrayList<>());
                productMap.get(name).add(product);
            } else {
                productMap.get(name).add(product);
            }

            if (!priceMap.containsKey(name)){
                priceMap.put(name, new ArrayList<>());
                priceMap.get(name).add(price);
            } else {
                priceMap.get(name).add(price);
            }


            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : productMap.entrySet()) {
            System.out.printf("%s->%n", entry.getKey());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.printf("Product: %s, Price: %.1f%n", entry.getValue().get(i), priceMap.get(entry.getKey()).get(i));
            }
        }
    }
}
