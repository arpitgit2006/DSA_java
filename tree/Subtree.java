public class Subtree {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static boolean isSubtree(Node root, Node subroot){
        if(root==null)
          return false;
        if(root.data==subroot.data){
          if(isidentical(root,subroot))
            return true;
        }
        return isSubtree(root.left,subroot)||isSubtree(root.right,subroot);
    }
    public static boolean isidentical(Node root,Node subroot){
      if(root.data==subroot.data){
        return true;
      }
      else if(root==null || subroot==null || root.data!=subroot.data){
        return false;
      }
      return isidentical(root.left,subroot.left)||isidentical(root.right,subroot.right);
    }
    public static void main(String []args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right = new Node(5);
        root.right.right = new Node(6);

        Node subroot = new Node(2);
        subroot.left = new Node(3); 
        subroot.right = new Node(4);
        System.out.println(isSubtree(root,subroot));
    }
}
