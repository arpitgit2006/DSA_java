public class MirrorTree {
  static class Node{
    int data;
    Node left,right;
    Node(int data){
      this.data=data;
      left=null;right=null;
    }
  }
  public static void mirror(Node root){
    if(root==null)
      return;
    if(root.left!=null && root.right!=null){
      Node temp=root.left;
      root.left=root.right;
      root.right=temp;
      mirror(root.left);
      mirror(root.right);
    }
    else if(root.left!=null){
      root.right=root.left;
      root.left=null;
      mirror(root.right);
    }
    else if(root.right!=null){
      root.left=root.right;
      root.right=null;
      mirror(root.left);
    }
  }
  public static void inorder(Node root){
    if(root==null)
      return;
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
  }
    public static void main(String[] args) {
      Node root=new Node(1);
      root.left=new Node(2);
      root.right=new Node(3);
      root.left.left=new Node(4);
      root.left.right=new Node(5);
      root.right.right=new Node(7);
      root.right.left=new Node(6);
      inorder(root);
      System.out.println("");
      mirror(root);
      inorder(root);
    }
}