package StreamsFilesAndDirectoriesLab;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class WriteEveryThirdLine_05 {
    public static void main(String[] args) throws IOException {
        String path1 = "E:\\softuni\\Advanced\\src\\input.txt";
        String path2 = "E:\\softuni\\Advanced\\src\\StreamsFilesAndDirectoriesLab\\asd.txt";

        List<String> lines = Files.readAllLines(Path.of(path1));
        for (int i = 1; i <= lines.size(); i++) {
            if (i%3==0){
                String line = lines.get(i);

            }
        }
    }
}
