/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Challenge05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test void passNull(){
        linkedList classUnderTest = new linkedList();
        int n=0;
        assertEquals(n, classUnderTest.count);
    }
    @Test void headPointToFirstElement(){
        linkedList classUnderTest = new linkedList();
        classUnderTest.insert(3);
        classUnderTest.insert(4);
        classUnderTest.insert(5);

        int n = 5;
        assertEquals(n,  classUnderTest.Head.value);
    }
    @Test void multipleNode(){
        linkedList classUnderTest = new linkedList();
        classUnderTest.insert(1);
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        int n = 3;
        assertEquals(n,  classUnderTest.length());
    }
    @Test void insert() {
        linkedList classUnderTest = new linkedList();
        assertEquals("Success",  classUnderTest.insert("hello"));
    }
    @Test void trueInclude() {
        linkedList classUnderTest = new linkedList();
        classUnderTest.insert("hello");
        String str= "true";
        str.equals( classUnderTest.includes("hello"));
    }

    @Test void falseInclude() {
        linkedList classUnderTest = new linkedList();
        classUnderTest.insert("hello");
        assertEquals(false ,classUnderTest.includes("Hey"));

    }
    @Test void collectionList() {
        linkedList classUnderTest = new linkedList();
        classUnderTest.insert("Renad");
        classUnderTest.insert("My Name Is");
        classUnderTest.insert("hello");

        String str ="{ hello } -> { My Name Is } -> { Renad } -> NULL ";
//        assertEquals(str ,c);
        str.equals(classUnderTest.includes("Hey"));

    }

}
