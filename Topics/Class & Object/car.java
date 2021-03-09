public class car{
    String color;   
    String model;
    String brand;//instance variables
    

    
}
 class test{
    public static void main(String args[]){
        car c=new car();
        car c1=new car();
        car c2=new car();
        c.color="RED";
        c.brand="maruti";
        c.model="swift";
        c1.color="BLACK";
        c1.brand="mahindra";
        c1.model="swift";
        c2.color="WHITE";
        c2.brand="maruti";
        c2.model="xuv500";
        System.out.println(c.color+" "+c.brand+" "+c.model);
        System.out.println(c1.color+" "+c1.brand+" "+c1.model);
        System.out.println(c2.color+" "+c2.brand+" "+c2.model);
        
        

        
        
    }
}
