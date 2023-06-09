/*
CPCS324 Group Project | Phase2 | Section B0B and B8
Alaa Algamdi ------2007156
Raghed alharbi -----2006518
Haifa Althobait-----2010445
Sara Alshaikh-------2005499

*/

package GraphFramework;

public abstract class Edge {
    

    /*
        Source vertex, destination vertex and
        parent vertex;
     */
   public Vertex source, destination, parent;

    //holds the weight assigned to the edge connecting the source and target vertices.
    public int weight;

    //--------------------Constructors---------------
  
    public Edge(Vertex source, Vertex destination, int weight, Vertex parent) {
        this.source = source;
        this.destination = destination;
        this.parent = parent;
        this.weight = weight;
    }
    public Edge(Vertex source, Vertex target, Vertex parent, int weight) {
        this.source = source;
        this.destination = target;
        this.parent = parent;
        this.weight = weight;
    }
      
    
     public Edge(Vertex source, Vertex destination, int weight) {
        this.source = source;
        this.destination = destination;
       
        this.weight = weight;
    }
//    

    //***********Getter And Settor **************
    public  Vertex getSource() {
        return source;
    }

    public Vertex getDestination() {
        return destination;
    }

    public int getWeight() {
        return weight;
    }

    public Vertex getparent(Vertex parent) {
        if (parent == source) {
            return destination;
        } else if (parent == destination) {
            return source;
        } else {
            throw new IllegalArgumentException("Vertex not in edge");
        }

    }

    public void setSource(Vertex source) {
        this.source = source;
    }

    public void setDestination(Vertex destination) {
        this.destination = destination;
    }

    public void setParent(Vertex parent) {
        this.parent = parent;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //--------------------Method And Function------------
    //1- method is responsible for displaying the information of the class attributes
    public void displayInfo() {
        System.out.println("Edge: " + source.getLabel() + " --" + weight + "--> " + destination.getLabel());
    }

   
    

}



