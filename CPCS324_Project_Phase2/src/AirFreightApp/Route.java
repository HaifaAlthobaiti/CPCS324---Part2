/*
CPCS324 Group Project | Phase2 | Section B0B and B8
Alaa Algamdi ------2007156
Raghed alharbi -----2006518
Haifa Althobait-----2010445
Sara Alshaikh-------2005499

*/

package AirFreightApp;

import GraphFramework.Vertex;

import GraphFramework.Vertex;
import graphframework.*;

public class Route extends GraphFramework.Edge{

    public Vertex getSource() {
        return source;
    }

    public void setSource(Vertex source) {
        this.source = source;
    }

    public Vertex getDestination() {
        return destination;
    }

    public void setDestination(Vertex destination) {
        this.destination = destination;
    }

    public Vertex getParent() {
        return parent;
    }

    public void setParent(Vertex parent) {
        this.parent = parent;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public Route(Vertex source, Vertex distenation, int weight) {
        super(source, distenation, weight);
    }
    
    public Route(Vertex source, Vertex distenation, Vertex parent, int weight) {
        super(source, distenation, parent, weight);
    }
    
    
    @Override
    public void displayInfo(){
        System.out.println(" --- route length: "); //display length
    }
    
}
