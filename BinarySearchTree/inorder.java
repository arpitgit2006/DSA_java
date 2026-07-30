import java.util.*;

public class inorder {
  static class Node{
    int data;
    Node left,right;
    Node(int data){
      this.data=data;
      left=null;
      right=null;
    }
  }
  public static Node bst(Node root,int val){
    if(root==null){
      root=new Node(val);
      return root;
    }
    if(val<root.data)
      root.left=bst(root.left,val);
    else
      root.right=bst(root.right,val);
    return root;

  }
  public static void inorder(Node root){
    if(root==null)
      return;
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
  }
  public static boolean search(Node root,int n){
    if(root==null)
      return false;
    if(root.data==n)
      return true;
    else if(root.data>n)
      return search(root.left,n);
    else
     return search(root.right,n);
  }
  public static Node delete(Node root,int n){
    if(root==null){
      return null;
    }
    if(root.data<n)
      root.right= delete(root.right,n);
    if(root.data>n)
      root.left= delete(root.left,n);
      if(root.data==n){
        if(root.left==null && root.right==null)
          return null;
        if(root.left==null)
          return root.right;
        else if(root.right==null)
          return root.left;
        else{
          int x= inordersuccessor(root.right);
          root.data=x;
          root.right= delete(root.right,x);
        }
      }
      return root;
  }
  public static int inordersuccessor(Node root){
    if(root.left==null){
      return root.data;
    }
    return inordersuccessor(root.left);
  }
    public static void main(String[] args) {
      Node root=null;
      int values[]={8,5,3,1,4,6,10,11,14};
      for(int i=0;i<values.length;i++){
        root=bst(root,values[i]);
      }
      inorder(root);
      System.out.println();
      int n=3;
      delete(root,14);
      inorder(root);
    }
}