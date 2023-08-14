package StreamsFilesAndDirectoriesLab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CopyBytes_03 {
    public static void main(String[] args) throws IOException {
        String path = "E:\\softuni\\Advanced\\src\\input.txt";
        List<String> lines = Files.readAllLines(Path.of(path));

        for (String line : lines){
            if (line.startsWith("\uFEFF")) {
                line = line.substring(1);  // Remove the BOM
            }
            for (int i = 0; i < line.length(); i++) {
                char symbol = line.charAt(i);
                if (symbol != ' ') {
                    System.out.print((int) symbol);
                } else {
                    System.out.println(" ");
                }
            }
        }

    }
}
