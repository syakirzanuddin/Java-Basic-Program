import java.util.Scanner;

public class FibonacciNumber{
    public static void main(String args[]) {
        int first=0, second=1, next, number;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("insert number: ");
        number = sc.nextInt(); //insert number
        
        System.out.print("Fibonacci of "+number+" is: ");
        
        for(int i=0; i<number; i++)
        {
            if(i<=1) //check if the number is more than 0 and 1
            {
                next = i;
            }else{ //if i more than 0 and 1, add previous two number
                next=first + second; //sum of first and second will be assign to next
                first=second; //second will be assign to first
                second=next; //next will be assign to second
            }
            System.out.print(next + " ");
        }
        
        
 }
 

}