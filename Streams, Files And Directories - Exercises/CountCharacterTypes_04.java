package StreamsFilesAndDirectoriesExercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CountCharacterTypes_04 {
    public static void main(String[] args) throws IOException {
        String path = "E:\\softuni\\Advanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";


        List<String> lines = Files.readAllLines(Path.of(path));
        int vowelsCount = 0;
        int punctuationCount = 0;
        int othersCount = 0;
        for (String line:lines){
            for (int i = 0; i < line.length(); i++) {
                char symbol = line.charAt(i);
                if (symbol == 'a' || symbol == 'o' || symbol == 'u' || symbol == 'e' || symbol == 'i'){
                    vowelsCount++;
                } else if (symbol == ',' || symbol == '.' || symbol == '?' || symbol == '!') {
                    punctuationCount++;
                } else if (symbol != ' ') {
                    othersCount++;
                }
            }
        }
        System.out.println("Vowels: " + vowelsCount);
        System.out.println("Other symbols: " + othersCount);
        System.out.println("Punctuation: " + punctuationCount);
    }
}
