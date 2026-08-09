import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
      HashMap<Integer,Integer> hm=new HashMap<>();
      int num[]={1,3,2,5,1,3,1,5,1};
      int n=num.length;
      for(int i=0;i<n;i++){
        if(hm.containsKey(num[i])){
          hm.put(num[i],hm.get(num[i])+1);
        }
        else{
          hm.put(num[i],1);
        }
      }
      Set<Integer> key=hm.keySet();
      for(int i:key){
        if(hm.get(i)>n/3){
          System.out.println(i);
        }
      }
    }
}