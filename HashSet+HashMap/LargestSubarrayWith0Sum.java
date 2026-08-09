import java.util.*;
public class LargestSubarrayWith0Sum {
    public static void main(String[] args) {
      int arr[]={15,-2,2,-8,1,7,10,23};
      HashMap<Integer,Integer> h=new HashMap<>();
      int sum=0,len=0;
      for(int i=0;i<arr.length;i++){
        sum+=arr[i];
        if(h.containsKey(sum)){
          len=Math.max(len,i-h.get(sum));
        }
        else{
          h.put(sum,i);
        }
      }
      System.out.println(len);
    }
}