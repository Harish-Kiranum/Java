package Access;
class Employee{
    // private modifier
    private  int empid;
    private  float Salary;
    // getter method
    public int getempid(){
        return empid;
    }
    public void setempid(int empid){
        this.empid = empid;
    }
    public float getSalary(){
        return Salary;
    }
    public void setsalary(float Salary){
        this.Salary = Salary;
    }
    // protected specifier
    //It can be accessed by the in herited class
    protected String company;
    protected String name;
    protected  Employee(String company, String name){
        this.company = company;
        this.name = name;
        System.out.println(" ");

    }
    public void display(){
        System.out.println("Enter the company name and employee name :"+" "+company+" "+name);
    }
}

class Companydetails{
     public static void main(String args[]){
         Employee c1 = new Employee();
         Employee c2 = new Employee("Kiranum","Harish");
         c2.display();
         c1.setempid(245678);
         c1.setsalary(23400f);
         System.out.println("The employee id is: "+" "+c1.getempid());
         System.out.println("The employee salary is" +" "+c1.getSalary());



    }

}