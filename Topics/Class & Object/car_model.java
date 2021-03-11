class Car {
    String color;   
    String model;
    String brand;//instance variables
    int size;
    int speed;
    public void record(int s1, int s2){//methods
        size = s1;
        speed = s2;
    }
    void display(){
        System.out.println(size+" "+speed);
    }
}
 public class car_model{
    public static void main(String args[]){
        Car c=new Car();
        Car c1=new Car();
        Car c2=new Car();
        Car s1=new Car();
        Car s2=new Car();
        c.color="RED";
        c.brand="maruti";
        c.model="swift";
        c1.color="BLACK";
        c1.brand="mahindra";
        c1.model="swift";
        c2.color="WHITE";
        c2.brand="maruti";
        c2.model="xuv500";
        System.out.println(c.color+" "+c.brand+" "+c.model);
        System.out.println(c1.color+" "+c1.brand+" "+c1.model);
        System.out.println(c2.color+" "+c2.brand+" "+c2.model);
        s1.record(185,345);
        s2.record(200,550);
        s1.display();
        s2.display();
    }
}