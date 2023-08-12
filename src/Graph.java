import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    class Vertex {
        int value;

        Vertex(int v) {
            value = v;
        }
    }

    class Edge {
        Vertex source;
        Vertex destination;

        Edge(Vertex s, Vertex d) {
            source = s;
            destination = d;
        }
    }

    Map<Vertex, List<Edge>> adjacencyList;

    Graph() {
        adjacencyList = new HashMap<>();
    }

    void addVertex(Vertex v) {
        adjacencyList.put(v, new ArrayList<>());
    }

    void addEdge(Vertex s, Vertex d) {
        adjacencyList.get(s).add(new Edge(s, d));
        adjacencyList.get(d).add(new Edge(d, s));
    }

    List<Edge> getEdge(Vertex v) {
        return adjacencyList.get(v);
    }

    void DisplayGraph() {
        for (Vertex v: adjacencyList.keySet()){
            System.out.print("vertex " + v.value + "-> edges ");
            for(Edge e: adjacencyList.get(v)){
                System.out.print("(" + e.source.value + ',' + e.destination.value + ")");
            }
            System.out.println();
        }

    }

}
