/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Challenge30;

import Challenge30.dataStructure.HashTable;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


import static Challenge30.RepeatedWord.repeatedWord;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test void test_NoRepeatedWord(){
        String str ="Heelo Iam Renad M";
//        repeatedWord(str);
        assertEquals("No word is repeated",repeatedWord(str));
    }

    @Test void test_HasOneRepeated(){
        String str ="Heelo Iam Renad Renad";
        assertEquals("renad",repeatedWord(str));
    }

    @Test void test_HasOneRepeatedWithCaretoCaseSenstive(){
        String str ="Heelo Iam Renad renad";
        assertEquals("renad",repeatedWord(str));
    }

    @Test void test_HasOneMoreRepeatedAndTakeTheLastRepeated(){
        String str ="Heelo Iam Renad renad Iam";
        assertEquals("iam",repeatedWord(str));
    }

}