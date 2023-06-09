
/*
CPCS324 Group Project | Phase2 | Section B0B and B8
Alaa Algamdi ------2007156
Raghed alharbi -----2006518
Haifa Althobait-----2010445
Sara Alshaikh-------2005499

*/
package GraphFramework;

import java.util.LinkedList;

public abstract class Vertex {
  


//represent vertex Lable 
     public String label;
    
    //Set to true if the current vertex is visited within a certain operation like graph traversal.
     boolean isVisited;
    
    //Represents the adjacency list of a vertex
    LinkedList<Edge> adjList;
    
    //--------------------Constructor---------------
    
    public Vertex() {
         adjList = new LinkedList<Edge>() ;
    }
    
    public Vertex(String label) {
        this.label = label;
        this.isVisited = true;
         adjList = new LinkedList<Edge>() ;
        
        
    }
    
    //***********Getter And Settor **************
    public String getLabel() {
        return label;
    }

    public boolean isIsVisited() {
        return isVisited;
    }

    public LinkedList<Edge> getAdjList() {
        return adjList;
    }

    public void setLabel(String label) { 
       for (int i = 0; i < 15; i++) {
            label= "O"+ i;
        }
    }

    public void setIsVisited(boolean isVisited) {
        this.isVisited = isVisited;
    }

    public void setAdjList(LinkedList<Edge> adjList) {
        this.adjList = adjList;
    }
    //--------------------Method And Function------------
    //public void addNeighbor(Vertex neighbor, int weight) {
      //  Edge edge = new Edge(this, neighbor, weight);
        //adjList.add(edge);
    //}
    
    //1- method is responsible for displaying the information of the class attributes
    
       public void displayInfo() {
        
    }
     
      
}
