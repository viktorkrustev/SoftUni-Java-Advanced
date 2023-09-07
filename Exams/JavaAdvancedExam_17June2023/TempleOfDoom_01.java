package Exams.JavaAdvancedExam_17June2023;

import java.util.*;
import java.util.stream.Collectors;

public class TempleOfDoom_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tool = scanner.nextLine().split("\\s+");
        String[] substance = scanner.nextLine().split(" ");
        List<Integer> challenges = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        ArrayDeque<Integer> tools = new ArrayDeque<>();
        Arrays.stream(tool).forEach(el -> tools.offer(Integer.valueOf(el)));
        ArrayDeque<Integer> substances = new ArrayDeque<>();
        Arrays.stream(substance).forEach(el -> substances.push(Integer.valueOf(el)));

        while (!tools.isEmpty() && !substances.isEmpty()){
            boolean isFind = false;
            int res = tools.peek() * substances.peek();
            for (int num : challenges){
                if (res == num){
                    tools.poll();
                    substances.pop();
                    challenges.remove((Integer) num);
                    isFind = true;
                    break;
                }

            }
            if (!isFind){
                int toolsElement = tools.poll() + 1;
                int substancesEl = substances.pop() - 1;
                tools.offerLast(toolsElement);

                if (substancesEl>0) {
                    substances.push(substancesEl);
                }
            }
        }


        if (challenges.isEmpty()){
            System.out.println("Harry found an ostracon, which is dated to the 6th century BCE.");
        }else {
            System.out.println("Harry is lost in the temple. Oblivion awaits him.");
        }


        if (!tools.isEmpty()){
            System.out.print("Tools: ");
        }
        int toolSize = tools.size();
        for (int t : tools){
            if (toolSize > 1){
                System.out.print(t + ", ");
            } else if (toolSize==1) {
                System.out.print(t);
                System.out.println();
            }
            toolSize--;
        }


        if (!substances.isEmpty()){
            System.out.print("Substances: ");
        }
        int subSize = substances.size();
        for (int s : substances){
            if (subSize > 1){
                System.out.print(s + ", ");
            } else if (subSize==1) {
                System.out.print(s);
                System.out.println();
            }
            subSize--;
        }


        if (!challenges.isEmpty()){
            System.out.print("Challenges: ");
        }
        int chSize = challenges.size();
        for (int ch : challenges){
            if (chSize > 1){
                System.out.print(ch + ", ");
            } else if (chSize==1) {
                System.out.print(ch);
                System.out.println();
            }
            chSize--;
        }

    }
}
