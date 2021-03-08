
interface multiplication{  
    int multiply(int i,int j);  
}  
  
public class main2{  
    public static void main(String[] args) {  
          
        // Multiple parameters in lambda expression
        multiplication ad1=(i,j)->(i*j);  
        System.out.println(ad1.multiply(5,10));    
    }  
}  