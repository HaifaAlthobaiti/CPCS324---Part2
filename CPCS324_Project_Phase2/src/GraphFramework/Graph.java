
/*
CPCS324 Group Project | Phase2 | Section B0B and B8
Alaa Algamdi ------2007156
Raghed alharbi -----2006518
Haifa Althobait-----2010445
Sara Alshaikh-------2005499

*/
package GraphFramework;

import java.util.*;
import java.io.*;
 
public abstract class Graph {
   int verticesNo=0;
 
      public int eddgNo =0;
   
   Vertex vertices[];
   
    public void makeGraph(int Nvertices, int Numofedge){
        this.vertices= new Vertex[Nvertices];
   
        int i = 0;
            do {
    // create vertex and add it to the list
    this.verticesNo++;
    vertices[i] = createVertex(Integer.toString(i + 1), verticesNo);
    i++;
} while (i < Nvertices);
        
         int ch[]=new int[Nvertices];
         int j = 0;
        while (j < Nvertices) {
            ch[j] = 0;
            j++;
        }
   
          
        for ( i = 0; i < Numofedge; i++) {
            // choose random weight
           Random random = new Random();
         int ra = random.nextInt(100) + 1;

           
            int ver1;
            int ver2;
            if(i<Nvertices-1){
           
            // choose vertex 1
            ver1 = (int) (Math.random() * Nvertices);
                while (ch[ver1] == 2) {
                    ver1 = (int) (Math.random() * Nvertices);
                }
                ch[ver1]++;

                ver2 = (int) (Math.random() * Nvertices);
                while (ch[ver2] == 2) {
                    ver2 = (int) (Math.random() * Nvertices);
                }
                ch[ver2]++;
            // the graph now is connected 
           }
           else{
                random = new Random();
                ver1 = random.nextInt(Nvertices);
                ver2 = random.nextInt(Nvertices);

        boolean true1 = true;
          
                while (true1) {
                    true1 = false;
                    ver1 = (int) (Math.random() * Nvertices);
                    ver2 = (int) (Math.random() * Nvertices);
                    if (ver2 == ver1) {
                        true1 = true;
                        continue;
                    }
                    j = 0;
                    do {
                        if (vertices[ver1].adjList.get(j).destination.label.equals(vertices[ver2].label)) {
                            true1 = true;
                            break;
                        }
                        j++;
                    } while (j < vertices[ver1].adjList.size());
}    
           }
           
           // add the edge
           this.eddgNo+=2;
           addEdge(vertices[ver1],vertices[ver2],ra);
           
           
           addEdge(vertices[ver2],vertices[ver1],ra);
        }
        
    }
       boolean isDigraph=false;
    
    
    public void readGraphFromFile(String fileName) throws FileNotFoundException{
       File file = new File(fileName);
       Scanner input = new Scanner (file);
       
       if("digraph 1".equals(input.nextLine()))
            this.isDigraph=true; 
       // read number of vertices
       
       int r = input.nextInt();
       // read number of edges
       
       int s= input.nextInt();
       
       this.vertices = new Vertex[r];
        
        for (int i = 0; i < s; i++) {
            String s1=input.next();
            String s2=input.next();
            int w = input.nextInt();
            
            if(vertices[(s1.charAt(0))-'A']==null){
                this.verticesNo++;
                vertices[(s1.charAt(0))-'A']= createVertex(s1, verticesNo);
            }
          
            
            if(vertices[(s2.charAt(0))-'A']==null){ 
                this.verticesNo++; 
                vertices[(s2.charAt(0))-'A']= createVertex(s2, verticesNo);
            }
           
            eddgNo=  eddgNo+1;
            Vertex vertex1 = vertices[s1.charAt(0) - 'A'];
            Vertex vertex2 = vertices[s2.charAt(0) - 'A'];
            addEdge(vertex1, vertex2, w);

            if (!isDigraph) {
                eddgNo = eddgNo + 1;
                vertex1 = vertices[s1.charAt(0) - 'A'];
                vertex2 = vertices[s2.charAt(0) - 'A'];
                addEdge(vertex2, vertex1, w);
            }
        }
    }
   
   public Edge addEdge(Vertex v, Vertex u, int w) {
    Edge e = createEdge(v, u, w);
    v.adjList.add(e);
    return e;
}
    //class vertx and edge 
    public abstract Edge createEdge(Vertex source, Vertex target, int weight);
    
    public abstract Vertex createVertex(String label, int verticesNo);
    
}
