
import java.util.*;
class Employee implements Cloneable{// Step 1
    String name ,id;
    Employee(String name, String id){
        this.name = name;
        this.id= id;
    }
    //display the content of the object name directly
    public String toString()
    {
        return "name ="+name+"\nid="+id;

    }
    // override method
    public Employee Clone() throws CloneNotSupportedException
    {
        return (Employee)super.clone();// create the object and reference the object

    }


}
public class Clone{
    public static void main(String args[]) throws CloneNotSupportedException{
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the employee name");
        String name = s.nextLine();
        System.out.println("Enter the employee id");
        String id = s.nextLine();
        Employee obj1 = new Employee(name,id);
        System.out.println(obj1);
        Employee obj2 = obj1.Clone();// Step 3
        System.out.println("Display the cloned object");
        System.out.println(obj2);



    }
}