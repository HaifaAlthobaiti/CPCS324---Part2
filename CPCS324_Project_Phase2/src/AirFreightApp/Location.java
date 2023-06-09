/*
CPCS324 Group Project | Phase2 | Section B0B and B8
Alaa Algamdi ------2007156
Raghed alharbi -----2006518
Haifa Althobait-----2010445
Sara Alshaikh-------2005499

*/

package AirFreightApp;

import GraphFramework.*;

public class Location extends GraphFramework.Vertex{
    
    String city = "city ";
            
    public Location(String label, int verticesNo) {
         super(label);
        city = city + verticesNo; // each city have number
        // from vertex class
        this.label = "loc. " + label;
        
    }
    
    @Override
    public void displayInfo(){
        System.out.print(label + ": " + city);
    }
    
}
