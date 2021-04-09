package sorting;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class Mobiles implements Comparable<Mobiles>
{
    private String Brand;
    private int RAM;
    private float price;
    public Mobiles(String brand, int rAM, float price) {
        Brand = brand;
        RAM = rAM;
        this.price = price;
    }
    
    public String getBrand() {
        return Brand;
    }
    public void setBrand(String brand) {
        Brand = brand;
    }
    public int getRAM() {
        return RAM;
    }
    public void setRAM(int rAM) {
        RAM = rAM;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Mobiles [Brand=" + Brand + ", RAM=" + RAM + ", price=" + price + "]";
    }

    @Override
    public int compareTo(Mobiles Mob2) {
        if(this.getRAM() > Mob2.getRAM()){
            return 1;
        }
        else{
            return -1;
        }
    }
    
}
public class Sort {
    public static void main(String args[]){
        List<Mobiles> mob = new ArrayList<Mobiles>();
        mob.add(new Mobiles("SAMSUNG",8, 27000));
        mob.add(new Mobiles("REALME",6,20000));
        mob.add(new Mobiles("HONOR 9X",8, 16000));
        Collections.sort(mob);
        for(Mobiles m: mob){
            System.out.println(m);

        }

    }
    
}
