//package Challenge34;
//
//import Challenge34.antonyms.Join;
//import Challenge34.antonyms.JoinNode;
//import Challenge34.dataStructure.HashTable;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class LeftJoin <T>{
//
//    public static List leftJoin(HashTable synonym, HashTable antonyms){
//        List<JoinNode> result =new ArrayList<>();
//         Join join1 = new Join<>();
//
//        for (Object word: synonym.keys()) {
//            result = join1.CreateSynonmAndAntonyms(word,synonym.get(word),antonyms.get(word));
//        }
//
//        print(result);
//        return result;
//    }
//
//    public static void print (List<JoinNode> result ){
////             ["guide", "usher","follow"]
//        System.out.println("[");
//           for (int i = 0; i < result.size(); i++) {
//
//               System.out.println("     [\"" + result.get(i).getKey() + " \", \"" + result.get(i).getSynonym() + " \", \"" + result.get(i).getAntonyms()+"\"]");
//           }
//        System.out.println("]");
//
//    }
//
//
//}
