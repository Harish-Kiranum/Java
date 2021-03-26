import java.util.*;
public class Treeset {
    public static void main(String args[]){
        TreeSet<String> places = new TreeSet<String>();
        //elements are add using add() method
        places.add("Chennai");
        places.add("Bangalore");
        places.add("Mumbai");
        places.add("Delhi");
        System.out.println(places);
        // removing the first element
        places.pollFirst();
        System.out.println("After removing the first element"+" "+places);
        // removing the last element
        places.pollLast();
        System.out.println("Removing the last element"+" "+places);
        // in descending order
        Iterator i = places.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        TreeSet<String>wonders = new TreeSet<>();
        wonders.add("Tajmahal");
        //using addAll() method
        // union of two sets
        wonders.addAll(places);
        System.out.println("New TreeSet"+" "+wonders);
        // intersection of two sets
        wonders.retainAll(places);
        System.out.println("Intersection of the set"+" "+wonders);
    }
    
}
