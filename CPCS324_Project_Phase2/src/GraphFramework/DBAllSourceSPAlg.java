
/*
CPCS324 Group Project | Phase2 | Section B0B and B8
Alaa Algamdi ------2007156
Raghed alharbi -----2006518
Haifa Althobait-----2010445
Sara Alshaikh-------2005499

*/
package GraphFramework;

public class DBAllSourceSPAlg extends ShortestPathAlgorithm{
    
    
    public DBAllSourceSPAlg(Graph graph){
        super(graph);
    }
    
   
    public void computeDijkstraBasedSPAlg(boolean fl){
        
        //Compute the shortest path 
        int numVertices;
        numVertices = this.graph.verticesNo;
        SingleSourceSPAlg Sin = new SingleSourceSPAlg(graph);
      int sourceV = 0;
      //compare source and numvertix
while (sourceV < numVertices) {
    //print start point
    System.out.println("The starting point location is " + graph.vertices[sourceV].label.charAt(5));// to return in position 5
   //print route
    System.out.println("The routes from location " + graph.vertices[sourceV].label.charAt(5) +
            " to the rest of the locations are:");
    
    Sin.computeDijkstraAlg(graph.vertices[sourceV], fl);
    System.out.println("\n----------------------------------------------------------------------\n");

    sourceV++;
}
        
    }
    
}
