public class Elective {
    public static void main(String args[]){
        String[] Elective1 = {"Data science","Data mining","Data Analytics","Big data"};
        String[] Elective2 ={"Machine learning","Artificial intelligence","Deep learning"};
        String [] Elective3 = {"Software testing","Agile software"};
        int l1 = Elective1.length;
        int l2 = Elective2.length;
        int l3 = Elective3.length;
        double Average= Math.random()*100;
        System.out.println("Average Marks of the elective subjects" +" "+Average);
        int Students = (int)(Math.random()*120);
        System.out.println("Total students of the Elective subjects"+" "+Students);
        int marks = (int)(Math.random()*35)+5;
        System.out.println(" marks obtained between 5 and 40"+" "+marks);
        int a = (int)(Math.random()*l1);
        int b = (int)(Math.random()*l2);
        int c = (int)(Math.random()*l3);
        System.out.println( "Total subjects"+" "+a+" "+b+" "+c);

    }
    
}
