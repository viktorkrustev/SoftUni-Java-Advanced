package StreamsFilesAndDirectoriesExercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumLines_01 {
    public static void main(String[] args) throws IOException {
        String path = "E:\\softuni\\Advanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        List<String> lines = Files.readAllLines(Path.of(path));
        for (String line:lines){
            int sum = 0;
            for (int i = 0; i < line.length(); i++) {
                char symbol = line.charAt(i);
                sum+=symbol;
            }
            System.out.println(sum);
        }
    }
}
