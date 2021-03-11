class emp_details{
    private String name;  //Instance variables
    private int age;
    private String company;
    private int stipend;
    public String getname(){ //Get method 
        return name;
    }
    public int getage(){
        return age;
    }
    public String getcompany(){
        return company;
    }
    public int getstipend(){
        return stipend;
    }
    public void setname(String n){ //set method
        name = n;
    }
    public void setage(int a){
        age = a;
    }
    public void setcompany(String c){
        company = c;
    }
    public void setstipend(int s){
        stipend = s;
    }
}
public class employee {
    public static void main(String args[]){
        emp_details e= new emp_details();
        e.setname("Harish");
        e.setage(20);
        e.setcompany("Kiranum private Limited");
        e.setstipend(12000);
        System.out.println("Employee name is"+" "+ e.getname());
        System.out.println("Employee age is"+" "+ e.getage());
        System.out.println("Employee company name"+" "+ e.getcompany());
        System.out.println("Employee intern stipend"+" "+ e.getstipend());
    }
}
