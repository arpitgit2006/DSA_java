public class InsertionInTrie {
  static class Node{
    Node children[]=new Node[26];
    Boolean eow=false;
    Node(){
      for(int i=0;i<26;i++){
        children[i]=null;
      }
    }
  }
  public static void insert(String str){
    Node curr=root;
    for(int i=0;i<str.length();i++){
      int idx=str.charAt(i)-'a';
      if(curr.children[idx]==null){
        curr.children[idx]=new Node();
      }
      curr=curr.children[idx];
    }
    curr.eow=true;
  }
  public static Node root=new Node();
  public static void main(String[] args) {
    String words[]={"the","a","there","their","any","thee"};
    for(String c : words)
      insert(c);
  } 
}