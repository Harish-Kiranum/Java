 abstract class bank_details{
     public void OTP_number(){// non- abstract method
         System.out.println("send to your mobile phone");

     }
     abstract void amount();// abstract method ended with semicolon , no curly braces 
}
// inherits the abstract class
class Indian_bank extends bank_details{ 
    public void amount()
    {
        System.out.println(12000);
    }
    public void interest(){
        System.out.println(345556);
    }

}
class SBI_bank extends bank_details{
    public void amount()
    {
        System.out.println(30000);
    }
}
public class bank {
    public static void main(String args[]){
        Indian_bank b = new Indian_bank();
        SBI_bank b1 = new SBI_bank();
        b1.amount();
        b.amount();
        b.OTP_number();
        b.interest();
        System.out.println("");
    }
    
}
