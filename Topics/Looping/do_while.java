public class do_while {
    public static void main(String args[]){
        int rem,rev=0;
        int num = 456789;
        do{
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;

            
        }while(num>0);
        System.out.println("reversed number is" + rev);

    }
    
}
