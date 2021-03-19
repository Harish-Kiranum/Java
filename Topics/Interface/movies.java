interface movies_details{
    public void movie_name(); // Abstract 
    public void ratings(); 
}
class kolly_wood implements movies_details{
    public void movie_name(){
        System.out.println( "kolly wood movie name is"+" "+"Master");
    }
    public void ratings(){
        System.out.println("movie rating"+" "+8);
    }

}
class Holly_wood implements movies_details{
    public void movie_name(){
        System.out.println("Holly wood movie name is"+" "+"Tenet");
    }
    public void ratings(){
        System.out.println("movie rating"+" "+7);
    }
}
public class movies {
    public static void main(String args[]){
        Holly_wood h = new Holly_wood();
        kolly_wood k = new kolly_wood();
        h.ratings();
        h.movie_name();
        k.ratings();
        k.movie_name();

    }
    
}