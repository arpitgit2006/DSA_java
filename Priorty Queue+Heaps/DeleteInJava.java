import java.util.*;
public class DeleteInJava {
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
    private void heapify(int i){
      int lchild=(2*i)+1;
      int rchild=(2*i)+2;
      int min=i;
      if(lchild<h.size() && h.get(lchild)<h.get(min)){
        min=lchild;
      }
      if(rchild<h.size() && h.get(rchild)<h.get(min)){
        min=rchild;
      }
      if(i!=min){
        int temp=h.get(i);
        h.set(i,h.get(min));
        h.set(min,temp);
        heapify(min);
      }

    }
    public void remove(){
      int temp=h.get(0);
      h.set(0,h.get(h.size()-1));
      h.set(h.size()-1,temp);
      h.remove(h.size()-1);
      heapify(0);
    }
    public int peek(){
      if(h.size()==0)
      return -1;
      return h.get(0);
    }
  }
    public static void main(String[] args) {
      Heap hp=new Heap();
      hp.add(10);
      hp.add(5);
      hp.add(30);
      hp.add(2);
      System.out.println(hp.h);
      hp.remove();
      System.out.println(hp.h);
      hp.remove();
      System.out.println(hp.h);
      hp.remove();
      System.out.println(hp.h);
      hp.remove();
      System.out.println(hp.h);

    }
}