/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Challenge05;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

//    public static void main(String[] args) {
//        System.out.println(new App().getGreeting());
//    }

    public static void main(String[] args) {

        linkedList<String> LS = new linkedList();
        LS.insert("Renad");
        LS.insert("My Name Is");
        LS.insert("hello");
        LS.print();
        System.out.println(LS.includes("hey"));
        LS.toSring();

    }
}