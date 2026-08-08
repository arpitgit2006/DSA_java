import java.util.*;

public class FindItineraryFromTickets {
    public static void main(String[] args) {
      HashMap<String,String> ticket=new HashMap<>();
      ticket.put("chennai","bangluru");
      ticket.put("mumbai","delhi");
      ticket.put("goa","chennai");
      ticket.put("delhi","goa");
      HashSet<String> h=new HashSet<>();
      for(String i:ticket.keySet())
        h.add(i);
      for(String i:ticket.values()){
        if(h.contains(i))
          h.remove(i);
      }
      String s=h.iterator().next();
      System.out.print(s);
      for(int i=0;i<ticket.size();i++){
        s=ticket.get(s);
        System.out.print(" -> "+s);
      }
    }
}