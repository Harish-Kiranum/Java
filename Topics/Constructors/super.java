package Exceptionhandling;

class Person{  
    int id;  
    String name;  
    Person(int id,String name){  
    this.id=id;  
    this.name=name;  
    }  
    }  
    class Employee extends Person{  
    float salary;  
    Employee(int id,String name,float salary){
        //  super can be invoke immediate parent class constructor 

    super(id,name); 
    }  
    void display()
    {
        System.out.println(id+" "+name+" "+salary);
    }  
    }  
     class Super{  
    public static void main(String[] args){  
    Employee e1=new Employee(1,"Harish",12000f);  
    e1.display();  
    }
} 