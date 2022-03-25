package CIE;
import java.util.*;
public class student{
    Scanner sc=new Scanner(System.in);
    public String usn,name;
    public int sem;
    
    public void accept(){
        System.out.println("Enter USN, Name and Semester: ");
        usn=sc.nextLine();
        name=sc.nextLine();
        sem=sc.nextInt();
    }
    public void display(){
        System.out.println("\n~~~Student Details~~~");
        System.out.println("Name: "+name);
        System.out.println("USN: "+usn);
        System.out.println("Semester: "+sem);
    }
}