package FunctionalProgrammingLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class CountUppercaseWords_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split(" ");

        Predicate<String> isUpper = word -> Character.isUpperCase(word.charAt(0));
        List<String> wordsList = new ArrayList<>();

        for (String w: text){
            if (isUpper.test(w)){
                wordsList.add(w);
            }
        }

        System.out.println(wordsList.size());

        wordsList.forEach(System.out::println);

    }
}
