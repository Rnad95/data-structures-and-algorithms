package Challenge37.graphDataStructure;


import java.util.*;

public class Graph {

    private int num =1;
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

    public Vertex addNode(String data, int weight){
        Vertex vertex = new Vertex<>(data,weight);
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

    public List addEdge(String data1,String data2, int weight){
        Vertex vertex1 = addNode(data1,weight);
        Vertex vertex2 = addNode(data2,weight);

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
            str.append(" =>");
            str.append(adjVertex.get(vertex));
            str.append("\n");
            str.append("*********\n");
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
    public boolean isEmpty(){
        return count == 0;
    }

    public String businessTrip (Graph graph, List arr ){
        String str ="$ ";
        int cost = 0;
        if(graph.isEmpty()){
            return str;
        }
        HashMap<String, Integer> visited = new HashMap<>();

        for (int i = 0; i <arr.size() ; i++) {

            List<Vertex> negibhors = graph.getNeighbors(arr.get(i).toString());
            System.out.println("*********************************************");
            if(i+1 >= arr.size()){
                break;
            }
            Vertex vertex =new Vertex<>(arr.get(i+1));
            System.out.println(" LIST => "+ negibhors);
            if(negibhors.contains(vertex)){
                if(!visited.containsKey(negibhors.get(i).toString())){
                    visited.put(negibhors.get(i).toString(),negibhors.get(i).getWeight());
                    System.out.println("WEIGHT WILL BE ADDED INSIDE COST " +arr.get(i).toString());
                    cost = cost + negibhors.get(i).getWeight();
                    System.out.println("COST =>"+ cost);

                }
            }else{
                continue;
            }
        }
        str = str + cost;
        return str;
    }

    @Override
    public String toString() {
        return "Graph{" +
                "adjVertex=" + adjVertex +
                '}';
    }
}
