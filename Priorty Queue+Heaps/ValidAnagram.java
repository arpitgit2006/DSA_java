import java.util.*;
public class ValidAnagram {
    public static void main(String[] args) {
      HashMap<Character,Integer> h1=new HashMap<>();
      String a="race";
      String b="pare";
      for(int i=0;i<a.length();i++){
        if(!h1.containsKey(a.charAt(i))){
          h1.put(a.charAt(i),1);
        }
        else
          h1.put(a.charAt(i),h1.get(a.charAt(i))+1);
      }
      for(int i=0;i<b.length();i++){
        if(h1.containsKey(b.charAt(i))){
          h1.put(a.charAt(i),h1.get(a.charAt(i))-1);
        }
        else{
          System.out.println("not anagram");
          return;
        }
      }
      for(char i:h1.keySet()){
        if(h1.get(i)!=0){
          System.out.println("not an anagram");
          return;
        }
      }
      System.out.println("valid anagram");
    }
}