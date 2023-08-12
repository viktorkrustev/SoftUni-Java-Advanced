package SetsAndMapsAdvancedLab;

import java.util.*;
import java.util.stream.Collectors;

public class Largest3Numbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nums = scanner.nextLine().split(" ");
        List<Integer> list = Arrays.stream(nums).map(Integer::parseInt)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());


        if (list.size()>3){
            for (int i = 0; i < 3; i++) {
                System.out.print(list.get(i) + " ");
            }

        } else {
            for (int el:list){
                System.out.print(el + " ");
            }
        }


    }
}
