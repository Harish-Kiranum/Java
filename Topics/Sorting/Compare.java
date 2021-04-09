import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.io.*;
class Student{
    String name;
    String rollno;
    float cgpa;
    public Student(String name, String rollno, float cgpa) {
        this.name = name;
        Rollno = rollno;
        this.cgpa = cgpa;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRollno() {
        return Rollno;
    }
    public void setRollno(String rollno) {
        Rollno = rollno;
    }
    public float getCgpa() {
        return cgpa;
    }
    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
}
class cgpaComparator implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        if(s1.cgpa == s2.cgpa){
            return 0;
        }
        else if(s1.cgpa > s2.cgpa){
            return 1;
        }
        else {
            return -1;
        }
    }
}
class nameComparator implements Comparator<Student>{
    public int compare(Student s1,Student s2){  
        return s1.name.compareTo(s2.name);  
        }  
}
public class Compare {
    public static void main (String args[]){
        ArrayList<Student> s = new ArrayList<Student>();
        s.add(new Student("Harish","17BCS089",8.6f));
        s.add(new Student("karthik","17BCS090",9.5f));
        s.add(new Student("Chandru","17BME123",8.8f));
        Collections.sort(s,new nameCompartor());
        for(Student stu: s){
            System.out.println(stu.name+" "+stu.rollno+" "+stu.cgpa);
        }
        Collections.sort(s,new cgpaCompartor());
        for(Student stu: s){
            System.out.println(stu.name+" "+stu.rollno+" "+stu.cgpa);
        }



    }

    
}
