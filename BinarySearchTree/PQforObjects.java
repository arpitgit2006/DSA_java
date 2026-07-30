import java.util.*;
public class PQforObjects {
  static class Student implements Comparable<Student>{
    int rank;
    String name;
    Student(int rank,String name){
      this.rank=rank;
      this.name=name;
    }
    @Override
    public int compareTo(Student s2){
      return this.rank-s2.rank;
    }
  }
    public static void main(String[] args) {
      PriorityQueue<Student> pq=new PriorityQueue<>();
      pq.add(new Student(3,"a"));
      pq.add(new Student(4,"c"));
      pq.add(new Student(1,"b"));
      pq.add(new Student(9,"e"));
      pq.add(new Student(5,"d"));
      while(!pq.isEmpty()){
        System.out.println(pq.peek().name+"->"+pq.peek().rank);
        pq.remove();
      }
    }
}