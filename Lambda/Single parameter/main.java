interface bank{  
    public String name(String name);  
}  
  
public class main{  
    public static void main(String[] args) {  
      
        // Lambda expression with single parameter.  
        bank b1=(name)->{  
            return "canara Bank, "+name;  
        };  
        System.out.println(b1.name("It is a nationalize bank"));  
              
        bank b2= name ->{  
            return "State Bank, "+name;  
        };  
        System.out.println(b2.name("It is a nationalize bank"));  
    }  
}  

