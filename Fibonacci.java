import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]) {
     int first=0, second=1, next;
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter number of terms: ");
     int term = sc.nextInt(); //input term
     
     for(int i=0; i<term; i++) //less than term
     {
         if(i<=1)
         {
             next = i;
         }else{
             next=first+second; 
             first=second;
             second=next;
         }
         System.out.print(" "+ next);
     }
     
    }
}