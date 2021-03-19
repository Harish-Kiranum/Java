// single inheritance
// Base class
class college{
    String name;
    String Location;
    int AIR;
    int size;
    public void collegedetails(String name, String Location, int AIR, int size)
{
    System.out.println("college details is"+"\n"+name+"\n"+Location+"\n"+AIR+"\n"+size);
}
}
// child class extends the base class
class department extends college{
    String name;
    int total_students;
    int total_faculties;
    int no_of_section;
    public void departmentdetails(String name, int total_students,int total_faculties,int no_of_section)
    {
        System.out.println("Department details is"+"\n"+name+"\n"+total_students+"\n"+total_faculties+"\n"+no_of_section);
    }
}
public class singleinheritance {
    public static void main(String args[]){
        department dept = new department();
        dept.collegedetails("KCT","CBE",82,150);
        dept.departmentdetails("CSE",450,30,10);
        System.out.println("");

    }
    
}
