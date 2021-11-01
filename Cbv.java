import java.util.Scanner;

public class Cbv{ //Call by value
    int marks = 99; 
    void subject(int marks){
        marks = marks - 10; 
        System.out.println("marks in subject method: "+ marks);
    }
    
    
    public static void main(String[] args)
    {
     Cbv cb = new Cbv();
     System.out.println("marks before change: " + cb.marks);
     cb.subject(88);
     System.out.print("marks after changes: " + cb.marks); 
     
    }
}