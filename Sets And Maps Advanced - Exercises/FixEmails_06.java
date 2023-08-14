package SetsAndMapsAdvancedExercises;

import java.util.Scanner;

public class FixEmails_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("stop")){
            String email = scanner.nextLine();
            if (!email.contains("us") && !email.contains("uk") && !email.contains("com")){
                System.out.printf("%s -> %s%n", input, email);
            }
            input = scanner.nextLine();

        }
    }
}
