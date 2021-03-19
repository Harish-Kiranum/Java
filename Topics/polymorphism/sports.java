// polymorphism 
class sports_details{
    public void score(){
        System.out.println("The score details of the match");
    }
}
// overriding 
class cricket extends sports_details{    // In overriding uses the extends keyword.
    public void score(){
        System.out.println("The cricket score of the match is"+" "+150);
    }
}
class hockey extends sports_details{
    public void score(){
        System.out.println("The hockey score of the match is"+" "+190);
    }
}
class badminton extends sports_details{
    public void score(){
        System.out.println("The badminton score of the match is"+" "+230);
    }
}
public class sports {
    public static void main(String args[]){
        cricket c = new cricket();
        hockey h = new hockey();
        badminton b = new badminton();
        c.score();
        h.score();
        b.score();
    }
    
}
