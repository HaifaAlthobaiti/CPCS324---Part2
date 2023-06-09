/*
CPCS324 Group Project | Phase2 | Section B0B and B8
Alaa Algamdi ------2007156
Raghed alharbi -----2006518
Haifa Althobait-----2010445
Sara Alshaikh-------2005499

*/
package AirFreightApp;

import GraphFramework.Edge;
import GraphFramework.Vertex;

import GraphFramework.*;


public class AFRouteMap extends GraphFramework.Graph{
    
    @Override
    public Vertex createVertex(String label, int verticesNo) { //from graph class (change createVertex hold 2 parametr)
        Location L = new Location(label, verticesNo);
        return L;
    }
    @Override
    public Edge createEdge(Vertex source, Vertex distenation, int weight) { //from graph class
        Route R = new Route(source, distenation, weight);
        return R;
    }
    
}
