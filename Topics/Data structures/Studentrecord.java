package Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class Studentrecord {
    public static void main(String args[]){
        HashMap <String ,String> hm = new HashMap<String, String>();
        // student name and rollno
        hm.put("Harish","17BCS089");
        hm.put("Ajith","17BCS120");
        hm.put("Bala","17BCS113");
        hm.put("Sathish","17BCS101");
        // prints key value pairs known as entry
        System.out.println(hm);// prints dictionary type
        // prints key 
        Set s = hm.keySet();
        System.out.println("keys are"+" "+s);
        // print values
        Collection c = hm.values();
        System.out.println("Values are"+" "+c);
        // key value pair
        Set s1 = hm.entrySet();
        System.out.println("Entries are"+" "+s1);
        Iterator i = s1.iterator();
        while(i.hasNext()){
            Map.Entry me = (Map.Entry) i.next();
            System.out.println(me.getKey()+":"+me.getValue());
            if(me.getKey().equals("Harish")){
                me.setValue("17BCS090");

            }
            System.out.println(me);
        
        }

        
    }
    
}
