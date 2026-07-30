import java.util.*;
public class distbtw2nodes {
  static class Node{
    int data;
    Node left,right;
    Node(int data){
      this.data=data;
      left=null;
      right=null;
    }
  }
  public static boolean getpath(ArrayList<Integer> path,Node root,int n){
    if(root==null)
    return false;
    path.add(root.data);
    if(root.data==n)
    return true;
    if(getpath(path,root.left,n)||getpath(path,root.right,n))
    return true;
    path.remove(path.size()-1);
    return false;
}
  public static int lca(Node root,int n1,int n2){
    ArrayList<Integer> p1=new ArrayList<>();
    ArrayList<Integer> p2=new ArrayList<>();
    if(!getpath(p1,root,n1)||!getpath(p2,root,n2)){
    return -1;
}
    int size=Math.min(p1.size(),p2.size());
    int r=-1;
    for(int i=0;i<size;i++){
      if(p1.get(i)==p2.get(i)){
        r=p1.get(i);
      }
      else
      break;
    }
    return r;
  }
  public static Node find(Node root,int ancestor){
    if(root==null){
      return null;
    }
    if(root.data==ancestor){
      return root;
    }
    Node left=null;
    if(root.left!=null)
      left=find(root.left,ancestor);
    if(left!=null)
      return left;
    return find(root.right,ancestor);
    
  }
  public static int dist(Node root,int n,int count){
    if(root==null)
      return -1;
    if(root.data==n){
      return count;
    }
    count++;
    int left=-1;
    if(root.left!=null)
      left=dist(root.left,n,count);
    if(left!=-1)
      return left;  
    return dist(root.right,n,count);
  }
  public static int lcd(Node root,int n1,int n2){
    int ancestor=lca(root,n1,n2);
    if(ancestor==-1)
      return -1;
    root=find(root,ancestor);
    return dist(root,n1,0)+dist(root,n2,0);

  }
    public static void main(String[] args) {
      Node root=new Node(1);
      root.left=new Node(2);
      root.right=new Node(3);
      root.left.left=new Node(4);
      root.left.right=new Node(5);
      root.right.right=new Node(6);
      int n1=4,n2=3;
      System.out.println("min dist btw "+n1+" "+n2+"= "+lcd(root,n1,n2));
    }
}