package Exams.JavaAdvancedRetakeExam_14December2022;

import java.util.*;

public class ClimbThePeaks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] portions = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] stamina = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        Deque<Integer> stack = new ArrayDeque<>();
        Arrays.stream(portions).forEach(stack::push);
        Deque<Integer> queue = new ArrayDeque<>();
        Arrays.stream(stamina).forEach(queue::offer);

        List<String> peaks = new ArrayList<>();
        int size = stack.size();
        Map<String, Integer> map = new HashMap<>(Map.of("Vihren", 80,
                "Kutelo", 90,
                "Banski Suhodol", 100,
                "Polezhan", 60,
                "Kamenitza", 70));

        for (int i = 0; i < size; i++) {
            int stackElement = stack.pop();
            int queueElement = queue.poll();

            int sum = stackElement + queueElement;

                if (sum >= 80 && sum < 90) {
                    peaks.add("Vihren");
                } else if (sum >= 90 && sum < 100) {
                    peaks.add("Kutelo");
                } else if (sum >= 100) {
                    peaks.add("Banski Suhodol");
                } else if (sum >= 60 && sum < 70) {
                    peaks.add("Polezhan");
                } else if (sum >= 70) {
                    peaks.add("Kamenitza");
                }

        }


        if (peaks.size() >= 5){
            System.out.println("Alex did it! He climbed all top five Pirin peaks in one week -> @FIVEinAWEEK");
        } else {
            System.out.println("Alex failed! He has to organize his journey better next time -> @PIRINWINS");
        }
        if (peaks.isEmpty()){
            return;
        }
        System.out.println("Conquered peaks:");
        peaks.stream().forEach(System.out::println);

    }
}
