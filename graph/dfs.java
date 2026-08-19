package graph;

import java.util.ArrayList;

public class dfs{
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
    public static void dfs(ArrayList<Node>[] graph,int curr,boolean arr[]){
        System.out.println(curr+" ");
        arr[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Node n=graph[curr].get(i);
            if(!arr[n.dest]){
                dfs(graph,n.dest,arr);
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
        dfs(graph,0,new boolean[v]);
    }
}
