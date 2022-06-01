/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Challenge37;

import Challenge37.graphDataStructure.Graph;
import Challenge37.graphDataStructure.Vertex;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test void test_AddNode() {
        Graph graph = new Graph();

        Vertex expected = new Vertex<>("A");
        assertEquals(expected,graph.addNode("A"));
    }
    @Test void test_AddEdge() {
        Graph graph = new Graph();
        List<Vertex> expected =new ArrayList<>();
        Vertex B = new Vertex<>("B");
        expected.add(B);
        assertEquals(expected,graph.addEdge("A","B"));
    }
    @Test void test_getNodes() {
        Graph graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addEdge("A","C");
        graph.addEdge("C","B");

        List<Vertex> expected =new ArrayList<>();
        Vertex A = new Vertex<>("A");
        Vertex B = new Vertex<>("B");
        Vertex C = new Vertex<>("C");

        expected.add(A);
        expected.add(B);
        expected.add(C);

        assertEquals(expected.toString(),graph.getNodes().toString());
    }
    @Test void test_getNeighbors() {
        Graph graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addEdge("A","C");
        graph.addEdge("C","B");

        List<Vertex> expected =new ArrayList<>();
        Vertex A = new Vertex<>("A");
        Vertex B = new Vertex<>("B");

        expected.add(A);
        expected.add(B);

        assertEquals(expected.toString(),graph.getNeighbors("C").toString());
    }
    @Test void test_getSize() {
        Graph graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addEdge("A","C");
        graph.addEdge("C","B");
        graph.addNode("d");

        int expected = 4;

        assertEquals(expected,graph.size());
    }
    @Test void test_onlyNodeAndWeCanEdgeProperly() {
        Graph graph = new Graph();
        graph.addNode("A");
        graph.addEdge("A","B");
        Vertex B = new Vertex<>("B");
        List<Vertex> expected = new ArrayList<>();
        expected.add(B);
        assertEquals(expected.toString(),graph.getNeighbors("A").toString());
    }
    @Test void test_EmptyGraph() {
        Graph graph = new Graph();
        boolean expected = graph.isEmpty();
      assertTrue(expected);
    }

    @Test void test_DFSEmptyElementGraph() {
        Graph graph = new Graph();
        boolean expected = graph.isEmpty();
        assertTrue(expected);
    }
    @Test void test_DFSOneElementGraph() {
        Graph graph = new Graph();
        graph.addNode("A");
        Set<String> visited = new LinkedHashSet<>();
        visited.add("A");
        assertEquals(visited,graph.DFS(graph,"A"));
    }
    @Test void test_DFSGraph() {
        Graph graph = new Graph();
        graph.addEdge("D","A",9);
        graph.addEdge("A","B",1);
        graph.addEdge("B","C",2);
        graph.addEdge("C","G",3);
        graph.addEdge("B","D",4);
        graph.addEdge("E","D",5);
        graph.addEdge("H","F",5);
        graph.addEdge("F","D",8);
        graph.addEdge("D","H",6);

        Set<String> visited = new LinkedHashSet<>();
        visited.add("A");
        visited.add("B");
        visited.add("C");
        visited.add("G");
        visited.add("D");
        visited.add("H");
        visited.add("F");
        visited.add("E");

        assertEquals(visited,graph.DFS(graph,"A"));
    }
}
