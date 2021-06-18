package ex46.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Process {

    public static void process() throws FileNotFoundException {
        String wordsFilePath = new File("src/main/java/ex46/files/words.txt").getAbsolutePath();
        String fileContent = Files.readFileContent(wordsFilePath);

        String[] words = fileContent.trim().split("\s+");
        HashMap<String, Integer> wordsCount = new HashMap();

        for (String word : words) {
            int count = 0;

            if (wordsCount.containsKey(word)) {
                count = wordsCount.get(word);
            }

            wordsCount.put(word, count + 1);
        }


        /**
         * - https://stackoverflow.com/questions/2839137/how-to-use-comparator-in-java-to-sort
         * - https://beginnersbook.com/2013/12/how-to-sort-hashmap-in-java-by-keys-and-values/
         * - https://docs.oracle.com/javase/8/docs/api/java/util/Map.Entry.html
         */
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList(wordsCount.entrySet());
        list.sort((Comparator) (o1, o2) -> {
            Map.Entry<String, Integer> entry1 = (Map.Entry<String, Integer>) o1;
            Map.Entry<String, Integer> entry2 = (Map.Entry<String, Integer>) o2;
            return entry2.getValue() - entry1.getValue();
        });

        Output.printResults(list);
    }

}
