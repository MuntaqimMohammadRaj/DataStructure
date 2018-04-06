
package bfs;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


public class Bfs {

   
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Graph g = new Graph(7);
     g.addEdge(1, 2);
     g.addEdge(1, 4);
     g.addEdge(1, 5);
     g.addEdge(2, 3);
     g.addEdge(3, 5);
     g.addEdge(3, 6);
     g.addEdge(3, 7);
     g.addEdge(4, 1);
     g.addEdge(4, 5);
     g.addEdge(5, 1);
     g.addEdge(5, 3);
     g.addEdge(5, 6);
     g.addEdge(6, 5);
     g.addEdge(6, 3);
     g.addEdge(6, 7);
     g.addEdge(7, 3);
     g.addEdge(7, 6);
     System.out.println("table is: ");
     g.BFS(1);
     
    
     
     
    }
    
}

class Graph
{
       private int x;
       private LinkedList<Integer> adj[];
       Graph(int n)
       {
           this.x=n+1;
           adj = new LinkedList[x];
        for (int i=1; i<x; ++i)
            adj[i] = new LinkedList();
          
       }
         void addEdge(int v,int w)
    {
        adj[v].add(w);
    }
         
         void BFS(int s)
         {
            boolean [] visited=new boolean[x];
            LinkedList<Integer> q = new LinkedList<Integer>();
            visited[s]=true;
            q.add(s);
            while(q.size()!=0)
            {
            s = q.poll();
            System.out.print(s+" ");
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    q.add(n);
                }
            }
            }
         }
}