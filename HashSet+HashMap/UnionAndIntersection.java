import java.util.*;
public class UnionAndIntersection {
    public static void main(String[] args) {
      int arr1[]={7,3,9};
      int arr2[]={6,3,9,2,9,4};
      HashSet<Integer> h=new HashSet<>();
      for(int i:arr1)
        h.add(i);
      for(int i:arr2)
        h.add(i);
      System.out.println("A union B = "+h.size());
      h.clear();
      int count=0;
      for(int i:arr1)
        h.add(i);
      for(int i:arr2){
        if(h.contains(i)){
          count++;
          h.remove(i);
        }
      }
      System.out.println("A intersection B = "+count);
    }
}