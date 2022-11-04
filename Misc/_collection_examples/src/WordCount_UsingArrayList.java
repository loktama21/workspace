//Count words using ArrayList

import java.util.*;

public class WordCount_UsingArrayList {
    public static void main(String[] args) {
        String initialSentence = "Hello I love Boston. Yes, you do Love Boston.";
        String[] initialWordsInArray = initialSentence.toLowerCase().split("[, ?.@]+");

//        List<String> wordList = new ArrayList<>(List.of(initialWordsInArray)); //mutable
        List<String> wordList = Arrays.asList(initialWordsInArray); //immutable

        Set<String> uniqueWords = new HashSet<>(wordList);
        for (String key : uniqueWords) {
            System.out.println(key + " = " + Collections.frequency(wordList, key));
        }
    }
}
