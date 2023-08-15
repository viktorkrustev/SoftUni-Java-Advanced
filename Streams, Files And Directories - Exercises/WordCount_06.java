package StreamsFilesAndDirectoriesExercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WordCount_06 {
    public static void main(String[] args) throws IOException {
        String textPath = "E:\\softuni\\Advanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";
        String wordsPath = "E:\\softuni\\Advanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";

        List<String> lines = Files.readAllLines(Path.of(textPath));
        List<String> wordsLine = Files.readAllLines(Path.of(wordsPath));

        Map<String, Integer> data = new LinkedHashMap<>();


        for (String line : lines) {
            String[] words = line.split(" ");
            for (String word : words) {
                for (String w:wordsLine){
                    String[] wParts = w.split(" ");
                    for (String part:wParts){
                        if (word.equals(part) && !data.containsKey(word)){
                            data.put(word, 1);
                        } else if (word.equals(part) && data.containsKey(word)) {
                            data.put(word, data.get(word) + 1);
                        }
                    }

                }
            }
        }

        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
