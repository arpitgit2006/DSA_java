import java.util.*;
public class MinimumCostToConnectRopes {
    public static void main(String[] args) {
      int rope[]={4,3,2,6};
      PriorityQueue<Integer> pq=new PriorityQueue<>();
      for(int i=0;i<rope.length;i++){
        pq.add(rope[i]);
      }
      int cost=0;
      while(pq.size()>1){
        int sum=pq.remove()+pq.remove();
        cost+=sum;
        pq.add(sum);
      }
      System.out.println(cost);
    }
}
