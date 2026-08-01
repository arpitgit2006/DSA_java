import java.util.*;

public class K_weakest_soldier {
  static class Soldier implements Comparable<Soldier>{
    int count;
    int index;
    Soldier(int c,int i){
      this.count=c;
      this.index=i;
    }
    @Override
    public int compareTo(Soldier S){
      if(this.count==S.count)
      return this.index-S.index;
      else
      return this.count-S.count;
    }
  }
    public static void main(String[] args) {
      PriorityQueue<Soldier> pq=new PriorityQueue<>();
      int arr[][]={{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
      int k=2,m=arr.length,n=arr[0].length;
      for(int i=0;i<m;i++){
        int c=0;
        for(int j=0;j<n;j++){
           if(arr[i][j]==1){
            c++;
           }
        }
        pq.add(new Soldier(c,i));
      }
      for(int i=0;i<k;i++){
        System.out.println("row "+pq.remove().index);
      }
    }
}
