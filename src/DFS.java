import java.util.Stack;
public class DFS {

    public void DFS(){
        Graph graph = new Graph();
        Graph.Vertex v1 = graph.new Vertex(0);
        Graph.Vertex v2 = graph.new Vertex(1);
        Graph.Vertex v3 = graph.new Vertex(2);
        Graph.Vertex v4 = graph.new Vertex(3);
        Graph.Vertex v5 = graph.new Vertex(4);
        graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);
        graph.addVertex(v4);
        graph.addVertex(v5);
        graph.addEdge(v1, v2);
        graph.addEdge(v1, v3);
        graph.addEdge(v2, v4);
        graph.addEdge(v2, v5);
        graph.addEdge(v3, v4);

        Stack<Graph.Vertex> stack = new Stack<>();
        boolean[] visited = new boolean[5];

        stack.push(v1);
        while (!stack.isEmpty()) {
            Graph.Vertex currentVertex = stack.pop();
            if (!visited[currentVertex.value]) {
                System.out.print(currentVertex.value + " ");
                visited[currentVertex.value] = true;

                for (Graph.Edge edge : graph.getEdge(currentVertex)) {
                    Graph.Vertex neighbor = edge.destination;
                    if (!visited[neighbor.value]) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }
}
