package Staticfinal;
class Student 
{
    // instance variable 
    String name;
    int rollNo;
      
    // static variable
    static String collegeName;
    static int counter = 0;
    // final variable 
    final String department = "CSE";
    final String Address = "Hostel";
       
    public Student(String name) 
    {
        this.name = name;
          
        this.rollNo = setRollNo();
    }
    static int setRollNo()
    {
        counter++;
        return counter;
    }
      
    // static method
    static void setCollege(String name){
        collegeName = name ;
    }
      
    // instance method
    void getStudentInfo(){
        System.out.println("name : " + this.name);
        System.out.println("rollNo : " + this.rollNo);
          
        // accessing static variable
        System.out.println("collegeName : " + collegeName);
        // accessing final variable
    
        System.out.println("Department and address details: "+" "+department+" "+Address);
    }
}

public class Static 
{
    public static void main(String[] args){
        
    
        Student.setCollege("KCT");
      
        Student s1 = new Student("Harish");
        Student s2 = new Student("Kumar");
          
        s1.getStudentInfo();
        s2.getStudentInfo();
          
    }
}