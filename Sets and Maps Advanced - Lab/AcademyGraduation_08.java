package SetsAndMapsAdvancedLab;

import javax.swing.event.ListDataEvent;
import java.util.*;

public class AcademyGraduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Double> infoMap = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            double sum = 0;
            double avg = 0;
            String name = scanner.nextLine();
            String[] grades = scanner.nextLine().split(" ");
            for (int j = 0; j < grades.length; j++) {
                double grade = Double.parseDouble(grades[j]);
                sum+=grade;
            }
            avg = sum/ grades.length;
            infoMap.put(name, avg);
        }

        for (Map.Entry<String, Double> entry : infoMap.entrySet()) {
            System.out.printf("%s is graduated with %s\n", entry.getKey(), entry.getValue());
        }
    }
}
