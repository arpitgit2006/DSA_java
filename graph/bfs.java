package graph;
import java.util.*;
public class bfs {
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
    public static void bfs(ArrayList<Node> graph[]){
        Queue<Integer> q=new LinkedList<>();
        boolean[] arr=new boolean[graph.length];
        q.add(0);
        while(!q.isEmpty()){
            int x=q.remove();
            if(!arr[x]){
                System.err.print(x+" ");
                arr[x]=true;
                for(int i=0;i<graph[x].size();i++){
                    Node a=graph[x].get(i);
                    q.add(a.dest);
                }
            }
        }
    }
    public static void main(String args[]){
        int v=7;
        ArrayList<Node>[] graph=new ArrayList[v];
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Node(0,1,1));
        graph[0].add(new Node(0,2,1));
        graph[1].add(new Node(1,0,1));
        graph[1].add(new Node(1,3,1));
        graph[2].add(new Node(2,0,1));
        graph[2].add(new Node(2,4,1));
        graph[3].add(new Node(3,1,1));
        graph[3].add(new Node(3,4,1));
        graph[3].add(new Node(3,5,1));
        graph[4].add(new Node(4,2,1));
        graph[4].add(new Node(4,3,1));
        graph[4].add(new Node(4,5,1));
        graph[5].add(new Node(5,3,1));
        graph[5].add(new Node(5,4,1));
        graph[5].add(new Node(5,6,1));
        graph[6].add(new Node(6,5,1));
        bfs(graph);
    }
}
