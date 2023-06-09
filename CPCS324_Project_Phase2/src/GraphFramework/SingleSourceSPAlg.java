/*
CPCS324 Group Project | Phase2 | Section B0B and B8
Alaa Algamdi ------2007156
Raghed alharbi -----2006518
Haifa Althobait-----2010445
Sara Alshaikh-------2005499

*/

package GraphFramework;

import java.util.PriorityQueue;

public class SingleSourceSPAlg extends ShortestPathAlgorithm {
    
   
    public SingleSourceSPAlg(Graph graph) {
        super(graph);
    }

    // METHODS
    public void computeDijkstraAlg(Vertex source, boolean fl) {
        int inf;
        int indexSrc;

        inf = Integer.MAX_VALUE;
        int[] parent = new int[this.graph.verticesNo];
        int[] dist = new int[this.graph.verticesNo];

       if (fl) {
        indexSrc = source.label.charAt(5) - 'A';
} else {
    indexSrc = Integer.parseInt(source.label.substring(5)) - 1;
}

        for (int i = 0; i < dist.length; i++) {
            dist[i] = inf;
        }
        dist[indexSrc] = 0;

        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0])); // q containing arrays with length 2 to store (val, node)

        // add the source to the queue
        int[] fpair = { 0, indexSrc };
        q.add(fpair);

        // while the queue is not empty
        
        if(q.isEmpty()){
        q=null;
        
        }else{
        while (!q.isEmpty()) {
            // get the node with the smallest distance
            int[] arr = q.poll();
            int val = arr[0], node = arr[1];

            // if the current distance is greater than the stored distance, skip
            if (dist[node] < val) {
                continue;
            }

            // iterate through adjacent vertices
            int adjIndex = 0;
            while (adjIndex < graph.vertices[node].adjList.size()) {
                Edge edge = graph.vertices[node].adjList.get(adjIndex);
                 int to;
             if (fl) {
          to = edge.destination.label.charAt(5) - 'A';
              } else {
                to = Integer.parseInt(edge.destination.label.substring(5)) - 1;
                     }
                
                int weight = edge.weight;

                // update the shortest distance
                if (dist[to] > val + weight) {
                    dist[to] = val + weight;
                    int[] pair = { dist[to], to };
                    q.add(pair);
                    parent[to] = node;
                }
                adjIndex++;
            }
        }
        }
        // print shortest path
        if (fl) {
            int i = 0;
            while (i < graph.verticesNo) {
                if (dist[i] == inf) {
                    System.out.println("\n There is no path from " + source.label + " to " + graph.vertices[i].label);
                    i++;
                    continue;
                }

                if (i != indexSrc) {
                    System.out.println("");
                    getPath(source, i, parent);
                    System.out.println(" --- route length: " + dist[i]);
                }
                i++;
            }
        }
    }

    // Display the shortest path to the node
    public void getPath(Vertex source, int node, int[] parent) {
        // Base case
        if (graph.vertices[parent[node]].label.equals(source.label)) {
            source.displayInfo();
            System.out.print("- ");
            graph.vertices[node].displayInfo();
        } else {
            getPath(source, parent[node], parent);
            System.out.print("- ");
            graph.vertices[node].displayInfo();
        }
    }
}