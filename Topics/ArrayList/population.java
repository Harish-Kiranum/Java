
import java.util.ArrayList;  
class pop {  
int year;  
String name; 
int population;  
public pop(int year, String name,  int population) {  
    this.year = year;  
    this.name = name; 
    this.population = population;  
}  
}  
public class population {  
public static void main(String[] args) {  
    //Creating list 
    ArrayList<pop> list=new ArrayList<pop>();  
    //Creating population  
    pop b1=new pop(1998,"India",1456790);  
    pop b2=new pop(2004,"China", 123678);
    pop b3=new pop(1994,"Srilanka",765432);  
    list.add(b1);  
    list.add(b2);  
    list.add(b3);  
    //Traversing list  
    for(pop b:list){  
        System.out.println(b.year+" "+b.name+" "+b.population);  
    }  
}  
}  