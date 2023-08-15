package StreamsFilesAndDirectoriesLab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class WriteToFile_02 {
    public static void main(String[] args) throws IOException {
        String path1 = "E:\\softuni\\Advanced\\src\\input.txt";
        String path2 = "E:\\softuni\\Advanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\output.txt";

        FileInputStream fileInputStream = new FileInputStream(path1);
        FileOutputStream fileOutputStream = new FileOutputStream(path2);
        Set<Character> punctuationTable = Set.of(',', '.', '!', '?');
        int bytes = fileInputStream.read();

        while (bytes != -1) {
            char symbol = (char) bytes;
            boolean isPunctuation = punctuationTable.contains(symbol);
            if (!isPunctuation) {
                fileOutputStream.write(symbol);
            }
            bytes = fileInputStream.read();
        }


        fileInputStream.close();
        fileOutputStream.close();
    }
}
