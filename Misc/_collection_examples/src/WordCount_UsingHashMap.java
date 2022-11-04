// Lab 11.2 Extra lab using HashMap

import java.util.*;

public class WordCount_UsingHashMap {
    public static void main(String[] args) {
        String initialSentence = "Hello I love Boston and Mexico. Yes, you do Love Boston and NY.";
        String[] initialWordsInArray = initialSentence.toLowerCase().split("[, ?.@]+");
        HashMap<String, Integer> uniqueWordsMap = new HashMap<>();

        for(String initialWord: initialWordsInArray){
            Integer integer = uniqueWordsMap.get(initialWord);
            if(integer == null){
                uniqueWordsMap.put(initialWord, 1);
            } else {
                uniqueWordsMap.put(initialWord, integer + 1);
            }
        }
        System.out.println(uniqueWordsMap.entrySet());
    }
}
