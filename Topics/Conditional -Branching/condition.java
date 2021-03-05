public class condition{
    public static void main(String args[]){
        int num=1567;
        if(num>=1 && num<=100){
            System.out.println("It is a two digit number");
        }
        else if(num>=100 && num<=1000){
            System.out.println("It is a three digit number");
        }
        else if(num>=1000 && num<=10000){
            System.out.println("It is a four digit number");
        }
        else{
            System.out.println("The number is not bertween 1 and 9999");
        }
        
    }
}
