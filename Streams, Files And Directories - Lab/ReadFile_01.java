package StreamsFilesAndDirectoriesLab;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class ReadFile_01 {
    private final static String FILE_PATH = "E:\\softuni\\Advanced\\src\\input.txt";
    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream(new File(FILE_PATH));
            int currentByte = fileInputStream.read();
            while (currentByte >= 0) {
                System.out.print(Integer.toBinaryString(currentByte) + " ");
                currentByte = fileInputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
