package StreamsFilesAndDirectoriesLab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExtractIntegers_04 {
    public static void main(String[] args) throws IOException {
        String path = "E:\\softuni\\Advanced\\src\\input.txt";
        FileInputStream fileInputStream = new FileInputStream(path);

        Scanner scanner = new Scanner(fileInputStream);
        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                int num = scanner.nextInt();
                System.out.println(num);
            }
            scanner.next();
        }
        fileInputStream.close();
    }
}
