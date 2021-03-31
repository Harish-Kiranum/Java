package Collections;
import java.util.ArrayList;
import java.util.Iterator;

public class Homeappliances {
    public static void main(String args[]){
        ArrayList<String> h = new ArrayList<String>();
        h.add("Television");
        h.add("Microwave oven");
        h.add("Air Conditioner");
        h.add("Washing Machine");
        System.out.println(h);
        // Iterator useful for retrieving object one by one
        Iterator i = h.iterator();
        // It contains three methods
        while(i.hasNext()){
            // hasNext refer boolean function
            if(i.next().equals("Washing machine")){
                i.remove();
            }
           System.out.println(i.next());
        }

    }
    
}
