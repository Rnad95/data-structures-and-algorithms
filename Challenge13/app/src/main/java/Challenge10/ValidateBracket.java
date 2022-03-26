package Challenge10;

import Challenge10.Stack.Stack;

public class ValidateBracket {
    public static boolean validateBrackets(String str){

        if(str.length()==1){
            return false;
        }
        if (str.isEmpty())
            return true;


        Stack stack = new Stack();
        for (int i = 0; i < str.length(); i++)
        {
//            if(bracketArr.length %2 !=0){'
//            return false;
//        }
            char first = str.charAt(i);


            if (first == '{'|| first =='('|| first == '[') {
                stack.push(first);

            }
            if (first == '}'|| first == ')'|| first == ']')
            {
                if (str.length() == 1 ) {
                    return false;
                }
                if (stack.isEmpty())
                    return false;

                char front = stack.peek();
                if (front == '{' && first == '}' || front == '(' && first == ')'|| front == '[' && first == ']' )
                    stack.pop();
                else
                    return false;
            }

        }
//        for (int a = 0; a < bracketArr.length; a++) {
//            if(bracketArr.length == 0){
//                stack2.push(bracketArr[a]);
//                System.out.println("Push");
//                continue;
//            }else{

//                Object Test = stack2.pop();
//                if(bracketArr[a] == hashMap.get(Test)){
//                    System.out.println("Pop");
//
//                }
        return true;
    }
}
