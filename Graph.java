package graphs;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    private int numVertices;
    private List<List<Integer>> adjacencyList;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjacencyList = new ArrayList<>(numVertices);
// Initialize the adjacency list
        for (int i = 0; i < numVertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) {
// Check if the vertices are within the valid range
        if (source >= 0 && source < numVertices && destination >= 0 && destination
                < numVertices) {
// Add the destination vertex to the adjacency list of the source vertex
            adjacencyList.get(source).add(destination);
// If the graph is undirected, add the source vertex to the adjacency list of the
            // destination vertex as well adjacencyList.get(destination).add(source); // Uncomment this
            // line for an undirected graph  {

        }
    }
}
