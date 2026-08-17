package graph;
import java.util.*;
public class adjacencyList {
    static class Node{
        int source;
        int dest;
        int weight;
        Node(int s,int d,int w){
            source=s;
            dest=d;
            weight=w;
        }
    }
    public static void main(String argsp[]){
        int v=5;
        ArrayList<Node>[] graph=new ArrayList[5];
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Node(0,1,5));
        graph[1].add(new Node(1,0,5));
        graph[1].add(new Node(1,2,1));
        graph[1].add(new Node(1,3,3));
        graph[2].add(new Node(2,1,1));
        graph[2].add(new Node(2,3,1));
        graph[2].add(new Node(2,4,2));
        graph[3].add(new Node(3,1,3));
        graph[3].add(new Node(3,2,1));
        graph[4].add(new Node(4,2,2));
        // 2's neighbour
        for(int i=0;i<graph[2].size();i++){
            Node n=graph[2].get(i);
            System.out.print(n.dest+" ");
        }
        
    }
}
