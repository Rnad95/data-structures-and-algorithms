package Challenge35.graphDataStructure;


import java.util.*;

public class Graph {

    private Map <Vertex, List<Vertex>> adjVertex;
    private int count=0;
    public Graph() {
        this.adjVertex = new HashMap<>();
    }

    public Graph(Map<Vertex, List<Vertex>> adjVertex) {
        this.adjVertex = new HashMap<>();
    }

    public Vertex addNode(String data){
        Vertex<String> vertex = new Vertex<>(data);
        if(!adjVertex.keySet().contains(vertex)){
            adjVertex.put(vertex,new ArrayList<>());
            count++;
        }
        return vertex;
    }



    public List addEdge(String data1,String data2){
        Vertex vertex1 = addNode(data1);
        Vertex vertex2 = addNode(data2);

        adjVertex.get(vertex1).add(vertex2);
        adjVertex.get(vertex2).add(vertex1);

        return adjVertex.get(vertex1);
    }

    public void addEdge(Vertex vertex1,Vertex vertex2){
        adjVertex.get(vertex1).add(vertex2);
        adjVertex.get(vertex2).add(vertex1);
    }

    public Set getNodes(){
        Set nodes = adjVertex.keySet();
        return nodes;
    }


    public List getNeighbors(String data){
        Vertex vertex = new Vertex(data);
        List<Vertex> neighbors = adjVertex.get(vertex);

        return neighbors;
    }

    public int size(){
        return count;
    }

    public String printGraph(){
        StringBuilder str= new StringBuilder();
        for (Vertex vertex :
                adjVertex.keySet()) {
            str.append(vertex);
            str.append(adjVertex.get(vertex));
            str.append("\n");
        }
        return str.toString();
    }


    public void removeVertex(String data){
        Vertex vertex = new Vertex<>(data);
        adjVertex.values().forEach(list ->list.remove(vertex));
        adjVertex.remove(vertex);
        if(count>0)
        count--;
    }

    public void removeEdge(String data1, String data2){
        Vertex<String> vertex1 = new Vertex<>(data1);
        Vertex<String> vertex2 = new Vertex<>(data2);

        adjVertex.get(vertex1).remove(vertex2);
        adjVertex.get(vertex2).remove(vertex1);
    }

    public Set<String> BFS(Graph graph, String root){

        Set<String> visited = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(root);
        visited.add(root);

        while (!queue.isEmpty()){
            String vertex = queue.poll();
            for (Vertex v :
                    graph.getAdjVerticies(vertex)) {
                if (!visited.contains((v.value)))
                {
                    if(!queue.contains(v.value))
                    queue.add(v.value.toString());
                    visited.add(v.value.toString());
                }
            }
        }
        return visited;
    }

    private List<Vertex> getAdjVerticies(String data) {
        return  adjVertex.get(new Vertex(data));
    }


    public boolean isEmplty(){
        return count == 0;
    }
    @Override
    public String toString() {
        return "Graph{" +
                "adjVertex=" + adjVertex +
                '}';
    }
}
