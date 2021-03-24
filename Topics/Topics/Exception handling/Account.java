package Exceptionhandling;
public class Account{
    static void withdraw(int amount) throws AmountException
    {
        if(amount>30000)
        {
            throw new AmountException("Not a sufficient amount to withdraw");
        }
        else
        {
            System.out.println("Withdraw money");
        }

    }
    public static void main(String args[]){
        try{
            withdraw(40000);
        }
        catch(Exception e)
        {
            System.out.println("Thanks for visit");
        }
    }

}
