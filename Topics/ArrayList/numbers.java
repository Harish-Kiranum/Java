import java.util.ArrayList;
public class numbers {
    
    public static void main(String args[]){
        ArrayList<String> country = new ArrayList<String>();
        country.add("France");
        country.add("India");
        country.add("China");
        System.out.println(country);
        
        boolean b1= country.contains("India");
        if(b1==true){
            System.out.println("The India is present");
        }
        else
        {
            System.out.println("The India is not present");
        }
        boolean b2= country.contains("Russia");
        if(b2==true){
            System.out.println("The Russia is present");
        }
        else{
            System.out.println("The Russia is not present");
        }
        
    }
}
