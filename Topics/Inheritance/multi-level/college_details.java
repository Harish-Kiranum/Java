// multi-level inheritance
// super class
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
// sub class extends the super class
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
//Derived class extends the super class and asubclass
class student extends department{
    String name;
    String roll_no;
    float cgpa;
    public void student_details(String name, String roll_no, float cgpa){
        System.out.println("Student details is"+"\n"+name+"\n"+roll_no+"\n"+cgpa);
    }
}
public class college_details {
    public static void main(String args[]){
        student dept = new student();
        dept.collegedetails("KCT","CBE",82,150);
        dept.departmentdetails("CSE",450,30,10);
        dept.student_details("Harish","17BCS089",8.6f);
        System.out.println("");

    }
    
}