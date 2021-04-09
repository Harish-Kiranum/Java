package Equalsmethods;

import java.util.Set;
import java.util.*;

public class Employee{
    String name;
    String empid;
    public Employee(String name, String empid) {
        this.name = name;
        this.empid = empid;
    }
    public static void main(String args[]){
        Employee e1 = new Employee("Harish","KCT089");
        Employee e2 = new Employee("Harish","KCT089");
        Set<Employee> employ = new HashSet<Employee>();
        employ.add(e1);
        employ.add(e2);
        // It prints the hashcode format
        System.out.println(employ);
        
        
    }
    
    @Override
    public String toString() {
        return "empid=" + empid + ", name=" + name ;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((empid == null) ? 0 : empid.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (empid == null) {
            if (other.empid != null)
                return false;
        } else if (!empid.equals(other.empid))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    
}