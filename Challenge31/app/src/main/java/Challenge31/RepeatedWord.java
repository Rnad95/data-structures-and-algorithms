package Challenge31;

import Challenge31.dataStructure.HashTable;

public class RepeatedWord {
    public RepeatedWord() {
    }

    public static String repeatedWord(String sentence) {
        sentence= sentence.replaceAll(","," ");
        String[] words  = sentence.split(" ");
        String result="No word is repeated";
        HashTable<String,String> wordMap = new HashTable<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            if (wordMap.get(word) != null) {
                result=word;
                System.out.println("RESULT INSIDE FOR LOOP =>"+ result);
                return result;
            } else {
                wordMap.set(word, word);
            }
        }
        System.out.println("RESULT =>"+ result);
        return result;
    }
}
