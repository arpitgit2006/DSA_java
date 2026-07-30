import java.util.*;
public class InsertInHeap {
  static class Heap{
    ArrayList<Integer> h=new ArrayList<>();
    public void add(int data){
      h.add(data);
      int x=h.size()-1;
      int pidx=(x-1)/2;
      while(h.get(x)<h.get(pidx)){
        int temp=h.get(x);
        h.set(x,h.get(pidx));
        h.set(pidx,temp);
        x=pidx;
        pidx=(x-1)/2;
      }
    }
  }
    public static void main(String[] args) {
      Heap hp=new Heap();
      hp.add(10);
      hp.add(5);
      hp.add(30);
      hp.add(2);
      System.out.println(hp.h);
    }
}