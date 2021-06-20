package ex46.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Process {

    public static void process() throws FileNotFoundException {
        String wordsFilePath = new File("src/main/java/ex46/files/words.txt").getAbsolutePath();
        String fileContent = Files.readFileContent(wordsFilePath);

        //split when find blank space between words
        String[] words = fileContent.trim().split("\s+");
        HashMap<String, Integer> wordsCount = new HashMap<>();

        //loop to find how many times the words are repeated
        for (String word : words) {
            int count = 0;

            if (wordsCount.containsKey(word)) {
                count = wordsCount.get(word);
            }

            wordsCount.put(word, count + 1);
        }

        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(wordsCount.entrySet());
        //sort list from most repeated word to less repeated word
        list.sort((o1, o2) -> o2.getValue() - o1.getValue());

        //send to Output class to print sorted list
        Output.printResults(list);
    }

}
