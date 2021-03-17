import java.util.ArrayList;
public class Books{
    public static void main(String args[]){
        ArrayList<String> b1= new ArrayList<String>();
        b1.add("The wind in the willows");// english bboks
        b1.add("Gulliver's Travel");
        b1.add("MiddleMarch");
        b1.add("Heart of Darkness");
        System.out.println("The famous book names in english"+" "+b1);
        // modify the list of the specific position
        b1.set(1,"A passage to India");
        System.out.println("The books are"+" "+b1);
        // add the new element in the specific position
        b1.add(1,"The Golden note-book");
        System.out.println("The books are"+" "+b1);
        // remove the element in the list
        b1.remove(1);
        System.out.println("The books are removed"+" "+b1);
        //check whether the list is empty or not
        System.out.println("the book is empty"+" "+b1.isEmpty());
        ArrayList<String> b2 = new ArrayList<String>();
        b2.add("The Beginning of the spring");
        System.out.println("the books are"+" "+b2);
        // adding first array list to the second list
        b2.addAll(b1);
        System.out.println("The books are"+" "+b2);
        // check whether the element is available in the list
        b2.contains("MiddleMarch");
        System.out.println(b2);
        b2.indexOf("The tree");
        System.out.println("The book is available in the list"+" "+b2);


    }


}

