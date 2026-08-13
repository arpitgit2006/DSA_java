public class WordBreak {
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
  public static boolean search(String str){
    Node curr=root;
    for(int i=0;i<str.length();i++){
      if(curr.children[str.charAt(i)-'a']==null){
        return false;
      }
      curr=curr.children[str.charAt(i)-'a'];
    }
    return curr.eow;
  }
  public static boolean wordBreak(String str){
    if(str.length()==0)
    return true;
    for(int i=1;i<=str.length();i++){
      if(search(str.substring(0,i)) && wordBreak(str.substring(i))){
        return true;
      }
    }
    return false;
  }
  public static Node root=new Node();
  public static void main(String[] args) {
    String words[]={"i","like","sam","samsung","mobile","ice"};
    for(String c : words)
      insert(c);
    String key="ilikesamsung";
    System.out.println(wordBreak(key));
  } 
}