
import java.util.HashMap;
class Dress{
    float price;
    String dressname;
    int totaldress;
    String quality;
    //use constructors
    public Dress(float price, String dressname, int totaldress,String quality){
        this.price = price;
        this.dressname = dressname;
        this.totaldress = totaldress;
        this.quality = quality;

    }
}
public class Hahmap {
    public static void main(String args[])
    {
        HashMap<Integer,Dress> hashmap  = new HashMap<Integer,Dress>();
        Dress h1 = new Dress(2000f,"Lycrashirts", 3,"Good");
        Dress h2 = new Dress(300f,"teeshirts",4,"Excellent");
        hashmap.put(1,h1);
        hashmap.put(2,h2);
        System.out.println("The customes are:"+" "+hashmap);

    }
    
}
