 
import java.util.ArrayList;
public class Copy {
 
 public static void main(String[] args) {
 
  ArrayList<Student> list = new ArrayList<>();
  list.add(new Student(100, "harish"));
  list.add(new Student(101, "Karthik"));
 
  ArrayList<Student> clonedList = (ArrayList) list.clone();
  Student s1 = new Student(102, "Kumar");
 
   clonedList.set(1,s1);
 
  System.out.println("Cloned list : " + clonedList);
  System.out.println("Original list : " + list);
 
 }
 
}
 
class Student {
 
 private int id;
 private String name;
 
 public Student(int id, String name) {
  super();
  this.id = id;
  this.name = name;
 }
 
 public int getId() {
  return id;
 }
 
 public void setId(int id) {
  this.id = id;
 }
 
 public String getName() {
  return name;
 }
 
 public void setName(String name) {
  this.name = name;
 }
 
 @Override
 public String toString() {
  return "Student [id=" + id + ", name=" + name + "]";
 }
 
}
