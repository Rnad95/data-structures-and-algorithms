/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Challenge35;

import Challenge35.graphDataStructure.Graph;
import Challenge35.graphDataStructure.Vertex;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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
        boolean expected = graph.isEmplty();
      assertTrue(expected);
    }

}
