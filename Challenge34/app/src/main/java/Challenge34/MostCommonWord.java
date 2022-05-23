package Challenge34;

import Challenge34.dataStructure.HashTable;

public class MostCommonWord {


    public static String mostCommonWord(String sentence){
        sentence= sentence.replaceAll(",","");
        sentence= sentence.replaceAll("\\.","");
        String[] words  = sentence.split(" ");
        Integer MaxCount = 0;
        String MostCommon = "No Common Word";
        HashTable<String,Integer> hashTable = new HashTable<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            Integer count = 0;
            if(hashTable.keys().contains(word)) {
                hashTable.set(word, ++count);
                if (MaxCount < count) {
                    MaxCount = count;
                    MostCommon = word;
                }
            }else{
                hashTable.set(word, 0);
            }
        }
        if(MostCommon.equals("No Common Word"))
            System.out.println(MostCommon);
        else
        System.out.println("Most Common Word: "+ MostCommon);
        return MostCommon;
    }
}

