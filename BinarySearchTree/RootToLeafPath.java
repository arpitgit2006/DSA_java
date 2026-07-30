import java.util.*;

public class RootToLeafPath {
  static class Node{
    int data;
    Node left,right;
    Node(int data){
      this.data=data;
      left=null;
      right=null;
    }
  }
  public static void roottoleafpath(ArrayList<Integer> a,Node root){
    if(root==null)
      return;
    a.add(root.data);
    if(root.left==null && root.right==null){
      System.out.println(a);
    }
    else{
      roottoleafpath(a,root.left);
      roottoleafpath(a,root.right);
    }
    a.remove(a.size()-1);
  }
    public static void main(String[] args) {
      Node root=new Node(8);
      root.left=new Node(5);
      root.right=new Node(10);
      root.left.left=new Node(3);
      root.left.right=new Node(6);
      root.left.left.left=new Node(1);
      root.left.left.right=new Node(4);
      root.right=new Node(10);
      root.right.right=new Node(11);
      root.right.right.right=new Node(14);
      ArrayList<Integer> a=new ArrayList<>();
      roottoleafpath(a,root);
    }
}