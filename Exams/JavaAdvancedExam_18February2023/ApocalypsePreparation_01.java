package Exams.JavaAdvancedExam_18February2023;

import java.security.KeyStore;
import java.util.*;
import java.util.stream.Collectors;

public class ApocalypsePreparation_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] queue = scanner.nextLine().split(" ");
        String[] stack = scanner.nextLine().split(" ");
        Deque<Integer> textiles = new ArrayDeque<>();
        Deque<Integer> medicaments = new ArrayDeque<>();

        Map<String, Integer> infoMap = new LinkedHashMap<>();

        Arrays.stream(queue).forEach(el -> textiles.offer(Integer.parseInt(el)));
        Arrays.stream(stack).forEach(el -> medicaments.push(Integer.parseInt(el)));
        infoMap.put("Patch", 0);
        infoMap.put("Bandage", 0);
        infoMap.put("MedKit", 0);

        while (!textiles.isEmpty() && !medicaments.isEmpty()){
            int currentTextile = textiles.pop();
            int currentMed = medicaments.pop();

            int sum = currentTextile + currentMed;

            if (sum == 30){
                infoMap.put("Patch", infoMap.get("Patch") + 1);
            } else if (sum == 40) {
                infoMap.put("Bandage", infoMap.get("Bandage") + 1);
            } else if (sum == 100) {
                infoMap.put("MedKit", infoMap.get("MedKit") + 1);
            } else if (sum > 100) {
                infoMap.put("MedKit", infoMap.get("MedKit") + 1);
                int diff = currentTextile - 100;
                int newEl = textiles.poll() + diff;
                textiles.offer(newEl);
            } else if (sum < 100) {
                medicaments.push(currentMed + 10);
            }
        }

        if (textiles.isEmpty()){
            System.out.println("Textiles are empty.");
        } else if (medicaments.isEmpty()) {
            System.out.println("Medicaments are empty.");
        } else {
            System.out.println("Textiles and medicaments are both empty.");
        }
        List<Map.Entry<String, Integer>> sortedItems = new ArrayList<>(infoMap.entrySet());

        // Сортиране на списъка според изискванията
        sortedItems.sort((entry1, entry2) -> {
            int result = entry2.getValue().compareTo(entry1.getValue()); // Намаляващ ред на броя предмети
            if (result == 0) {
                result = entry1.getKey().compareTo(entry2.getKey()); // Азбучен ред на имената на предметите
            }
            return result;
        });
        // Извеждане на сортираните предмети
        for (Map.Entry<String, Integer> entry : sortedItems) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        if (!textiles.isEmpty()) {
            System.out.print("Textiles left: ");
            textiles.forEach(el -> String.join(", ",String.valueOf(el)));
        }

        if (!medicaments.isEmpty()) {
            System.out.print("Medicaments left: ");
            medicaments.forEach(el -> String.join(", ",String.valueOf(el)));
        }
    }
}
