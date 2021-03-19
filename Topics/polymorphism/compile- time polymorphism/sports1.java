// method overloading in polymorphism
class sports1{
    public void score_details(int cricket){
        System.out.println("cricket match score"+" "+cricket);// same name but different argument list

    }
    public void score_details(int cricket ,int football){
        System.out.println("cricket match and football match"+" "+cricket+" "+football);
    }
    public void score_details(int cricket, int football, int hockey){
        System.out.println("Cricket match, football match and hockey match"+" "+cricket+" "+football+" "+hockey);
    }

    public static void main(String args[]){
        sports1 s= new sports1();
        s.score_details(230);
        s.score_details(278,217);
        s.score_details(129,78,234);
        System.out.println("");


    }
}
