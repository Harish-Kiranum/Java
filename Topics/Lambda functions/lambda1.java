import java.util.*;//lambda functions
public class lambda1{  
    public static void main(String[] args) {  
          
        ArrayList<String> l1=new ArrayList<String>(); 
        ArrayList<Integer> l2 = new ArrayList<Integer>(); 
        l1.add("Harish");  
        l1.add("kumar"); 
        l2.add(5674); 
        l1.add("Ajith");  
        l1.add("vijay");  //using lambda with stream API
        l2.add(12334);
          
        l2.forEach(  
            (n)->System.out.println(n)  
        ); 
        l1.forEach(  
            (n)->System.out.println(n)  
        );  
    }  
} 
