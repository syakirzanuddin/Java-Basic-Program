import java.util.Scanner;

public class FibonacciRecursive{
    public static void main(String args[]) {
      
      FibonacciRecursive fr = new FibonacciRecursive(); //create object if we want to call function without static
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter number: ");
      int number = sc.nextInt();
      System.out.print(number);
      
      System.out.print("\nfibonacci series of "+number+" is: " );
      for(int i=0; i<number; i++ ) //loops based on inserted number
      {
          System.out.print(fr.fibo(i) + " "); //output value of fibo function
      }

 }
 
 int fibo(int n)
 {
     if(n==0||n==1) //if number is 0 or 1
     {
         return n; //out of the loop
     }else{
         return fibo(n-1) + fibo(n-2); //additon of previous two number for next number
     }
 }

}