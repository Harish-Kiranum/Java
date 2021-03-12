class details{
    String name;  // Declare variables
    String department;
    int rollno;
    float cgpa;
    boolean good = true;
}
public class studentdetails {
    public static void main(String args[]){
        details d[] = new details[3]; // Declare Array of objects
        d[0]= new details();
        d[0].name = "Harish";
        d[0].department = "CSE";
        d[0].rollno=89;
        d[0].cgpa = 8.6f;
        d[1]= new details();
        d[1].name = "Karthi";
        d[1].department = "ECE";
        d[1].rollno = 23;
        d[1].cgpa= 9.1f;
        d[2]= new details();
        d[2].name = "Devi";
        d[2].department = "IT";
        d[2].rollno = 26;
        d[2].cgpa = 8.2f;
        System.out.println(d[2].name +" "+d[2].department+" "+ d[2].rollno+" "+d[2].cgpa);
        System.out.println(d[0].name +" " + d[0].department+" "+d[0].rollno+" "+d[0].cgpa);
        System.out.println(d[1].name +" " + d[1].department+" "+d[1].rollno+" "+d[1].cgpa);
    }
}
