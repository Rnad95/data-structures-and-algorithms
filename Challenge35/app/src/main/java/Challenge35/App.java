/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Challenge35;

import Challenge35.graphDataStructure.Graph;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("D");
        graph.addEdge("A","B");
        graph.addEdge("B","C");
        graph.addEdge("A","C");

        System.out.println(graph.size());
        System.out.println("Nodes => "+graph.getNodes());
        System.out.println(graph.printGraph());


//        graph.removeVertex("B");
//        System.out.println(graph.printGraph());
        System.out.println("SIZE => "+graph.size());

//        graph.removeEdge("A","D");
        System.out.println(graph.printGraph());

        System.out.println("Neighbors => "+ graph.getNeighbors("A"));
        System.out.println( graph.BFS(graph,"A"));


    }
}
