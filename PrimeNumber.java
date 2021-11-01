import java.util.Scanner;

public class PrimeNumber{
    public static void main(String args[]) {
     int a=0;
     Scanner sc= new Scanner(System.in);
     int n = sc.nextInt();
     
     for(int i=2; i<n-1; i++){ //start with 2, until n-1, exp 13-1, divide number to 2-12
     if(n%i==0) //if number when divide by other number except own number, 1 and get 0
     {
        a=a+1;
     }
     }
     
     if(a>0)
    {
        System.out.print(n+" is not prime number");
        
    }else{
        System.out.print(n+" is prime number");
    }
     
    }
}