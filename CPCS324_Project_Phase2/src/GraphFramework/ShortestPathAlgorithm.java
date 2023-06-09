/*
CPCS324 Group Project | Phase2 | Section B0B and B8
Alaa Algamdi ------2007156
Raghed alharbi -----2006518
Haifa Althobait-----2010445
Sara Alshaikh-------2005499

*/
package GraphFramework;

public class ShortestPathAlgorithm {

    public Graph getGraph() {
        return graph;
    }

    public void setGraph(Graph graph) {
        this.graph = graph;
    }
    
    // ATRIBUTES
    Graph graph;
    
    // CONSTRUCTOR
    ShortestPathAlgorithm(Graph graph){
        this.graph = graph;
    }
    
}