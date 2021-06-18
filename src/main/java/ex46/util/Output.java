package ex46.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Output {

    private  static String generateBar(int n) {
        return "*".repeat(n);
    }

    static public void printResults(ArrayList<Map.Entry<String, Integer>> wordsCount) {
        String leftAlignFormat = "%-10s : %-20s %n";

        for (Map.Entry<String, Integer> wordInfo : wordsCount) {
            String bar = generateBar(wordInfo.getValue());
            System.out.printf(leftAlignFormat, wordInfo.getKey(), bar);
        }
    }

}
