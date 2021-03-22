class Lab{
    Lab(String name){
        System.out.println("Name of the lab"+" "+name);
    }
    Lab(String name, String Incharge){
        System.out.println("Name of the lab"+" "+name);
        System.out.println("Incharge name of the lab"+" "+Incharge);
    }
    Lab(String name, String Incharge, int block){
        System.out.println("Name of the lab"+" "+name);
        System.out.println("Incharge name of the lab"+" "+Incharge);
        System.out.println("Block number of the lab"+" "+block);
    }
}
    public class Test{
    public static void main(String args[]){
        Lab l1 = new Lab("DAA");
        Lab l2 = new Lab("ML","RAM");
        Lab l3 = new Lab("MAD","NANDA", 4);

        System.out.println("");
    }
}
    