package SetsAndMapsAdvancedLab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        Map<Double, Integer> map = new LinkedHashMap<>();
        for (String num: numbers) {
            double n = Double.parseDouble(num);
            if (!map.containsKey(n)){
                map.put(n, 1);
            } else {
                map.put(n, map.get(n) + 1);
            }
        }

        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
                System.out.printf("%.1f -> %d%n",entry.getKey(), entry.getValue());
        }
    }
}
