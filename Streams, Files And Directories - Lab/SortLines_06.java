package StreamsFilesAndDirectoriesLab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class SortLines_06 {
    public static void main(String[] args) throws IOException {
        String path = "E:\\softuni\\Advanced\\src\\input.txt";

        List<String> lines = Files.readAllLines(Path.of(path));
        Collections.sort(lines);
        for (String line: lines){
            System.out.println(line);
        }
    }
}
