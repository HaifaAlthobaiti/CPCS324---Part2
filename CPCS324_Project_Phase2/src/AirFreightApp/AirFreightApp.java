/*
CPCS324 Group Project | Phase2 | Section B0B and B8
Alaa Algamdi ------2007156
Raghed alharbi -----2006518
Haifa Althobait-----2010445
Sara Alshaikh-------2005499

*/

package AirFreightApp;

import GraphFramework.DBAllSourceSPAlg;
import GraphFramework.SingleSourceSPAlg;




import java.io.FileNotFoundException;
import java.util.Scanner;

public class AirFreightApp {

    static AFRouteMap map;

    public static void main(String[] args) throws FileNotFoundException {
        // Initialization
        int option;
        boolean flag;
        DBAllSourceSPAlg allSourceAlg;
        SingleSourceSPAlg singleSourceAlg;

        
        System.out.println("( implementaion the Dijkstra's Algorithm for shotests path )");
        System.out.println(" ");

        // choose
        System.out.println("       Type (1) to use read from File: /n Type (2) to use generate random:");
      

        
        map = new AFRouteMap();
        Scanner input = new Scanner(System.in);

        boolean f=false;

        
        option = input.nextInt();

        // Read from file
        if (option == 1) {
            System.out.print("Enter your file name: ");
            f = true;
            String fileName = input.next();
            map.readGraphFromFile(fileName);
            System.out.println("\n");

            // Compute the allsource shortest path 
            allSourceAlg = new DBAllSourceSPAlg(map);
            allSourceAlg.computeDijkstraBasedSPAlg(f);

        } else if (option == 2) { 
            
            int n = 0;
            int m = 0;
            int choice;
            boolean validChoice = false;

            while (!validChoice) {
                
                System.out.println("\n\n--------------------- Choose From 1 to 5 ------------------");
                System.out.println("* where n = number of vertices and m = number of edges *");
                System.out.println("* These are the available cases: *");
                System.out.println("    1) n=2,000  *  m=10,000  ");
                System.out.println("    2) n=3,000  *  m=15,000  ");
                System.out.println("    3) n=4,000  *  m=20,000  ");
                System.out.println("    4) n=5,000  *  m=25,000  ");
                System.out.println("    5) n=6,000  *  m=30,000  ");
                System.out.println("-------------------------------");
                System.out.print("Your choice: ");

                choice = input.nextInt();

                if (choice >= 1 && choice <= 5) {
                    validChoice = true;

                    if (choice == 1) {
                        n = 2000;
                        m = 10000;
                    } else if (choice == 2) {
                        n = 3000;
                        m = 15000;
                    } else if (choice == 3) {
                        n = 4000;
                        m = 20000;
                    } else if (choice == 4) {
                        n = 5000;
                        m = 25000;
                    } else if (choice == 5) {
                        n = 6000;
                        m = 30000;
                    }

                    // Generate random graph
                    map.makeGraph(n, m);

                    // Compute the single-source shortest path problem using SingleSourceSPAlg
                    singleSourceAlg = new SingleSourceSPAlg(map);
                    long startTime = System.nanoTime();
                    singleSourceAlg.computeDijkstraAlg( new Location("1", n),f);
                    long endTime = System.nanoTime();
                    long Totaltime = endTime - startTime;
                    System.out.println("------------------------------------------------");
                    System.out.println("The Total time: " + Totaltime );
                    System.out.println(" ");
                } else {
                    System.out.print("Wrong! Please choose from 1 to 5: ");
                }
            }
        }
        else System.out.println("Wrong Entry ");
    }
}