class Student 
{
    String name;
    int rollNo;
    String className;
    boolean result;
    
    Student(String name, int rollNo) // parameterized constructor
    {
        this.name = name;
        this. rollNo = rollNo;
    }
    
    Student(String name, int rollNo, String className, boolean result)
    {
        this.name = name;
        this. rollNo = rollNo;
        this.className = className;
        this.result = result;        
    }
    
    public void display()
    {
        System.out.println("Name of Student = " + name);
        System.out.println("Roll no = "+ rollNo);
        System.out.println("Class Name = "+ className);
        System.out.println("Is student belongs to city = "+ result);
    }
}
public class Main{
    public static void main (String args[])
    {
        
        // Student student1 = new Student("Karthi", 1);
        // student1.display();
        
        Student student2 = new Student("Rishi", 2, "MCA", true);
        student2.display();
        
    }    
}

