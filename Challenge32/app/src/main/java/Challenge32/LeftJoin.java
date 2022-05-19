package Challenge32;

import Challenge32.antonyms.Join;
import Challenge32.antonyms.JoinNode;
import Challenge32.dataStructure.HashTable;

import java.util.ArrayList;
import java.util.List;

public class LeftJoin <T>{

    public static List leftJoin(HashTable synonym, HashTable antonyms){
        List result =new ArrayList<>();
         Join join1 = new Join();

        for (Object word: synonym.keys()) {
            result = join1.CreateSynonmAndAntonyms(word,synonym.get(word),antonyms.get(word));
        }

        print(result,synonym,antonyms);
        return result;
    }

    public static void print (List<JoinNode> result , HashTable synonym, HashTable antonyms){
//             ["guide", "usher","follow"]
        System.out.println("[");
           for (int i = 0; i < result.size(); i++) {

               System.out.println("     [\"" + result.get(i).getKey() + " \", " + result.get(i).getAntonyms() + " \", " + result.get(i).getSynonym()+"\"]");
           }
        System.out.println("]");

    }


}
