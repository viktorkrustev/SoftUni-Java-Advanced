package StreamsFilesAndDirectoriesExercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class AllCapitals_03 {
    public static void main(String[] args) throws IOException {
        String path = "E:\\softuni\\Advanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";


        List<String> lines = Files.readAllLines(Path.of(path));
        for (String line:lines){
            line = line.toUpperCase();
            System.out.println(line);
        }
    }
}
