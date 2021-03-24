package Exceptionhandling;
import java.io.*;
class Bank{
    // Bank class does not declare any exception;
    void Balanceamount(){
        System.out.println("Balance amount"+" "+12000);    
    }
}
class SBI extends Bank{
    // SBI class declare of unchecked exception
    void Balanceamount() throws ArithmeticException{
        System.out.println("Balance amount"+" "+5000);
    }
}
class HDFC extends SBI{
    // declare the two exception
    void Balanceamount() throws RuntimeException,ArithmeticException{

    }
}
public class Details {
    public static void main(String args[])
    {
        Bank b1 = new SBI();
        b1.Balanceamount();

    }
}
