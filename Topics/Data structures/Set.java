
import java.util.HashSet;
import java.util.Iterator;

public class Set {
    public static void main(String a[]){
        HashSet places = new HashSet();
        places.add("Chennai");
        places.add("Coimbatore");
        places.add("Bangalore");
        places.add("pune");
        
        ////for(String a : places){
            //System.out.println(a);
        //}
    
    HashSet places1= new HashSet();
    places1.addAll(places);
    System.out.println("In second array:"+" "+places1);
    // change the value in second array
    //places1.set(2,"Delhi");
    //System.out.println(places1);
    // In array  1 the value is not changed
    System.out.println(places);
    places.remove("pune");
    System.out.println(places);
    Iterator<String> it = places.iterator();
    while(it.hasNext()){
        System.out.println(it.next());
    }
    Iterator<String> i = places1.iterator();
    while(i.hasNext()){
        System.out.println(i.next());
    }
    
    }

    
}