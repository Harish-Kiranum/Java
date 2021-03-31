package Collections;
import java.util.ArrayList;
import java.util.ListIterator;

public class Homeappliances1 {
    public static void main(String args[]){
        ArrayList<String> h = new ArrayList<String>();
        h.add("Television");
        h.add("Microwave oven");
        h.add("Air Conditioner");
        h.add("Washing Machine");
        System.out.println(h);
        ListIterator li= h.listIterator();
        li.add("Fridge");
        while(li.hasNext()){
            if(li.next().equals("Washing machine")){
                li.set("Mixie");
            
            }
            System.out.println(h);

        }
    
}
}
