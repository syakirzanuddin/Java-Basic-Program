import java.util.Scanner;

public class ArmStrong{
    public static void main(String args[]) {
     int sum=0, r;
     Scanner sc= new Scanner(System.in);
     int n = sc.nextInt();
     int a=n;
 
     while(n>0)
     {
     r=n%10; 
     sum=sum+r*r*r;
     n=n/10;
     }
     
     if(a==sum)
    {
        System.out.print(a+" is Armstrong number");
        
    }else{
        System.out.print(a+" is not Armstrong number");
    }
     
    }
    //Test changes
    //add comment to test 
}