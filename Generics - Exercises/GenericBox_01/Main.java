package GenericsExercises.GenericBox_01;

import GenericsExercises.GenericBox_01.Box;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Box<String> box = new Box(new ArrayList<>());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            box.add(input);
        }
        System.out.println(box.toString());
    }
}
