import java.util.*;

public class MergeTwoBST {
  static class Node{
    int data;
    Node left,right;
    Node(int data){
      this.data=data;
      left=null;
      right=null;
    }
  }
  public static Node createBST(ArrayList<Integer> a,int s,int e){
    if(s>e)
      return null;
    int mid=(s+e)/2;
    Node root=new Node(a.get(mid));
    root.left=createBST(a,s,mid-1);
    root.right=createBST(a,mid+1,e);
    return root;
  }
  public static void preorder(Node root){
    if(root==null)
      return ;
    System.out.print(root.data+" ");
    preorder(root.left);
    preorder(root.right);
  }
  public static void treeToArray(ArrayList<Integer> a,Node root){
    if(root==null)
      return;
    a.add(root.data);
    treeToArray(a,root.left);
    treeToArray(a,root.right);
  }
  public static Node merge(Node root1,Node root2){
    ArrayList<Integer> a=new ArrayList<>();
    treeToArray(a,root1);
    treeToArray(a,root2);
    Collections.sort(a);
    return createBST(a,0,a.size()-1);
  }
    public static void main(String[] args) {
      Node root1=new Node(2);
      root1.left=new Node(1);
      root1.right=new Node(4);
      Node root2=new Node(9);
      root2.left=new Node(3);
      root2.right=new Node(12);
      Node root=merge(root1,root2);
      preorder(root);
    }
}