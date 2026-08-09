import java.util.*;
public class PQinJCF {
    public static void main(String[] args) {
      PriorityQueue<Integer> pq=new PriorityQueue<>();
      PriorityQueue<Integer> pqrev=new PriorityQueue<>(Comparator.reverseOrder());
      pq.add(4);
      pq.add(2);
      pq.add(7);
      pq.add(3);
      pq.add(5);
      while(!pq.isEmpty()){
        System.out.print(pq.peek()+" ");
        pq.remove();
      }
      System.out.println();
      pqrev.add(4);
      pqrev.add(2);
      pqrev.add(7);
      pqrev.add(3);
      pqrev.add(5);
      while(!pqrev.isEmpty()){
        System.out.print(pqrev.peek()+" ");
        pqrev.remove();
      }
    }
}