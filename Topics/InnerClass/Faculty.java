package innerclass;
import java.util.*;

class Staff{
    private String name;
    private String staffid;
    // use parametrized constructor
    public Staff(String iname, String istaffid){
        name = iname;
        staffid = istaffid;
    }
    // nested class
    public class Degree{
        public String degreename;
        public int yearstarted;
        // use parametrized constructors
        public Degree(String idegreename, int iyearstarted){
            degreename = idegreename;
            yearstarted = iyearstarted;
        }
        public void display(){
            System.out.println(" The staff name is"+name);
            System.out.println("The staff id is"+ " "+staffid);
            System.out.println(degreename+" "+yearstarted);
        }
    }
}
public class Faculty {
    public static void main(String args[]){
        // create an object for outer class
        Staff s1 = new Staff("Harish", "17BCS089");
        //  create an object for inner class
        Staff.Degree dobj = s1.new Degree("BE",2017);
        dobj.display();



    }
    
}
