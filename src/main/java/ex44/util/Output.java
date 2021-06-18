package ex44.util;

public class Output {

    static public void printResult(boolean isAnagram, String word1, String word2) {
        String response = "\"" + word1 + "\" and \"" + word2 + "\" are ";

        if (!isAnagram) {
            response += "not ";
        }

        response += "anagrams.";

        System.out.println(response);
    }

}
