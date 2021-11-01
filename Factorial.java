import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {
     int f=1;
     Scanner sc= new Scanner(System.in);
     int term = sc.nextInt();
     
     for(int i=1; i<term+1; i++)
     {
         f=f*i;
     }
     
     System.out.print("Factorial of "+term+" is "+f);
     
    }
}