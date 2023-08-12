package SetsAndMapsAdvancedLab;

import java.util.*;

public class AverageStudentsGrades_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentsInfoMap = new TreeMap<>();
        Map<String, Double> avgGradeMap = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");
            String name = data[0];
            double grade = Double.parseDouble(data[1]);

            if (!studentsInfoMap.containsKey(name)){
                studentsInfoMap.put(name, new ArrayList<>());
                studentsInfoMap.get(name).add(grade);
            } else {
                studentsInfoMap.get(name).add(grade);
            }
        }

        for (Map.Entry<String, List<Double>> entry : studentsInfoMap.entrySet()) {
            double sum = 0;
            double avg = 0.0;
            System.out.printf("%s -> ", entry.getKey());
            List<Double> value = entry.getValue();
            for (int i = 0; i < value.size(); i++) {
                double grade = value.get(i);
                sum += grade;
                avg = sum / entry.getValue().size();
                System.out.printf("%.2f ", entry.getValue().get(i));
            }
            avgGradeMap.put(entry.getKey(), avg);
            System.out.printf("(avg: %.2f)\n", avgGradeMap.get(entry.getKey()));
        }
    }
}
