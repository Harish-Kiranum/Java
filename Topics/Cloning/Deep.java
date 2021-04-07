import java.util.ArrayList;
import java.util.Iterator;
public class Deep {
 
    public static void main(String[] args) {
    
     ArrayList<Student> list = new ArrayList<>();
     list.add(new Student(100, "harish"));
     list.add(new Student(101, "Karthik"));
    
     ArrayList<Student> clonedList = new ArrayList<>();
    
     Iterator<Student> it = list.iterator();
     while (it.hasNext()) {
      Student s = it.next();
      Student n = new Student(s.getId(), s.getName());
      clonedList.add(n);
     }
    
     Student student = clonedList.get(1);
     student.setName("Kumar");
    
     System.out.println("Cloned list : " + clonedList);
     System.out.println("Original list : " + list);
    
    }
    
   }
   
