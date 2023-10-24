package Exams.JavaAdvancedExam_25June2022;

import java.util.*;

public class ChocolateTime_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Double> queue = new ArrayDeque<>();
        Deque<Double> stack = new ArrayDeque<>();

        double[] milk = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        double[] cacao = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        Arrays.stream(milk).forEach(queue::offer);
        Arrays.stream(cacao).forEach(stack::push);

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Milk Chocolate", 0);
        map.put("Dark Chocolate", 0);
        map.put("Baking Chocolate", 0);


        while (!stack.isEmpty() && !queue.isEmpty()){
            double lastMilk = queue.poll();
            double lastCacao = stack.pop();

            double sum = lastMilk + lastCacao;
            double total = (lastCacao/sum) * 100;

            if (total == 30){
                map.put("Milk Chocolate", map.get("Milk Chocolate") + 1);
            } else if (total == 50) {
                map.put("Dark Chocolate", map.get("Dark Chocolate") + 1);
            } else if (total == 100) {
                map.put("Baking Chocolate", map.get("Baking Chocolate") + 1);
            } else {
                queue.offer(lastMilk + 10);
            }
        }

        boolean isEmpty = false;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 0){
                isEmpty = true;
                System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
                break;
            }
        }
        if (!isEmpty){
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
        }

        map.entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(c -> {
                            if (c.getValue() > 0) {
                                System.out.printf("# %s --> %d%n", c.getKey(), c.getValue());
                            }
                        }
                );

    }
}
