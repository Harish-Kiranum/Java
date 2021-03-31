package StaticKeyword;
class Student{
    // static variables
    static String name;
    static String dept;
    static float cgpa;
    // non static mrthod
    String mentorname;
    public Student(String mentorname){
        this. mentorname = mentorname;

    }
    void display1(){
        System.out.println("mentor name is:"+" "+mentorname);
    }
    // static method 
    static void display(){
        System.out.println("Enter the student UG percentage");

    }
    // first static block 
    static{
        name = "Harish";
        dept = "cse";
        System.out.println("Student name and dept details"+" "+name +" "+dept);
    }
    // second static block
    static{
        name = "Karthik";
        dept = "mechanical";
        System.out.println("Student name and dept details"+" "+name +" "+dept);
        
    }
}


public class Details {
    public static void main(String args[]){
        Student s = new Student("jency");
        s.display1();
        System.out.println(Student.cgpa);
        Student.display();
    }
    
}
