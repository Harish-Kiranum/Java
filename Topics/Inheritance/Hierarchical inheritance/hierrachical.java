class college{
    String name;
    String Location;
    int AIR;
    int size;
    public void collegedetails(String name, String Location, int AIR, int size)
{
    System.out.println("college details is"+"\n"+name+"\n"+Location+"\n"+AIR+"\n"+size);
}
}
// child class extends the base class
class department extends college{
    String name;
    int total_students;
    int total_faculties;
    int no_of_section;
    public void departmentdetails(String name, int total_students,int total_faculties,int no_of_section)
    {
        System.out.println("Department details is"+"\n"+name+"\n"+total_students+"\n"+total_faculties+"\n"+no_of_section);
    }
}
class forums extends college{
    String clubname;
    int started_year;
    int no_of_students;
    public void forumsdetails(String clubname, int started_year, int no_of_students){
        System.out.println("Forum details is"+"\n"+clubname+"\n"+started_year+"\n"+no_of_students);

    }
}
public class hierrachical {
    public static void main(String args[]){
        department dept = new department();
        forums f = new forums();
        f.collegedetails("KCT","CBE",82,150);
        dept.departmentdetails("CSE",450,30,10);
        f.forumsdetails("Agam Forum", 2012, 45);
    }
    
}
