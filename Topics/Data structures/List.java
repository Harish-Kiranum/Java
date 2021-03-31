package Collections;
import java.util.ArrayList;

public class List {
    public static void main(String args[]){
        ArrayList<String> places = new ArrayList<String>();
        places.add("Chennai");
        places.add("Coimbatore");
        places.add("Bangalore");
        places.add("pune");
        
        for(String a : places){
            System.out.println(a);
        }
    
    ArrayList<String> places1= new ArrayList<String>();
    places1.addAll(places);
    System.out.println("In second array:"+" "+places1);
    // change the value in second array
    places1.set(2,"Delhi");
    System.out.println(places1);
    // In array  1 the value is not changed
    System.out.println(places);
    places.remove("pune");
    System.out.println(places);
    
    }

    
}
