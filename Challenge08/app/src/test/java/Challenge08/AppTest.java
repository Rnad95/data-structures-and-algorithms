/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Challenge08;

import org.junit.jupiter.api.Test;

import static Challenge08.LinkedList.zipLists;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test void LengthOfTwoListIsSame(){
        LinkedList<Integer> ls1 = new LinkedList<>();
        ls1.append(1);
        ls1.append(3);
        ls1.append(2);
        LinkedList<Integer> ls2 = new LinkedList<>();
        ls2.append(5);
        ls2.append(9);
        ls2.append(4);
        LinkedList<Integer> res = zipLists(ls1,ls2);
        int length = 6;
        assertEquals(length,res.length());
    }
    @Test void List1IsLarger(){
        LinkedList<Integer> ls1 = new LinkedList<>();
        ls1.append(1);
        ls1.append(3);
        ls1.append(2);
        LinkedList<Integer> ls2 = new LinkedList<>();
        ls2.append(5);
        ls2.append(9);
        LinkedList<Integer> res = zipLists(ls1,ls2);
        int length = 5;
        assertEquals(length,res.length());
    }
    @Test void List2IsLarger(){
        LinkedList<Integer> ls1 = new LinkedList<>();
        ls1.append(1);
        ls1.append(3);
        LinkedList<Integer> ls2 = new LinkedList<>();
        ls2.append(5);
        ls2.append(9);
        ls2.append(4);
        LinkedList<Integer> res = zipLists(ls1,ls2);
        int length = 5;
        assertEquals(length,res.length());
    }
}
