package Exams.JavaAdvancedRetakeExam_9August2023;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MonsterExtermination_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> armourValues = Arrays.stream(scanner.nextLine().split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> soldierValues = Arrays.stream(scanner.nextLine().split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        ArrayDeque<Integer> armours = new ArrayDeque<>();
        armourValues.stream().forEach(armours::offer);

        ArrayDeque<Integer> impacts = new ArrayDeque<>();
        soldierValues.stream().forEach(impacts::push);


        int monstersCount = 0;
        while (!armours.isEmpty() && !impacts.isEmpty()){
            int armourValue = armours.peek();
            int impactValue = impacts.peek();

            if (impactValue >= armourValue){
                monstersCount++;
                int newValue = impactValue - armourValue;
                impacts.pop();
                armours.poll();
                if (newValue > 0){
                    if (impacts.size()>1){
                        int lastEl = impacts.pop() + newValue;
                        impacts.push(lastEl);
                    } else {
                        impacts.push(newValue);
                    }
                }
            } else {
                impacts.pop();
                armours.poll();
                int newArmourValue = armourValue - impactValue;
                armours.offer(newArmourValue);
            }
        }

        if (armours.isEmpty()){
            System.out.println("All monsters have been killed!");
        }
        if (impacts.isEmpty()) {
            System.out.println("The soldier has been defeated.");
        }

        System.out.println("Total monsters killed: " + monstersCount);

    }
}
