
public class printinrange {
  static class Node{
    int data;
    Node left,right;
    Node(int data){
      this.data=data;
      left=null;
      right=null;
    }
  }
  public static void printinrange(Node root,int n1,int n2){
    if(root==null)
      return;
    if(root.data>=n1 && root.data<=n2){
      printinrange(root.left,n1,n2);
      System.out.print(root.data+" ");
      printinrange(root.right,n1,n2);
    }
    else if(root.data<n1){
      printinrange(root.right,n1,n2);
    }
    else if(root.data>n2){
      printinrange(root.left,n1,n2);
    }
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
      printinrange(root,5,12);
    }
}