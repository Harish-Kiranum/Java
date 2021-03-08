interface Bank_details{  
    public String Bank_name(String name);
    public int balance(int amount);  
}  
  
public class Lambda{  
    public static void main(String[] args) {  
      
        // Lambda expression with single parameter.  
        Bank_details s1=(name)->{  
            return "Canara";
        };  
        System.out.println(s1.Bank_name); 
          
        // You can omit function parentheses    
        Bank_details s2= (amount)->{  
            return 13456;  
        };  
        System.out.println(s2.balance();  
    }  
}  
