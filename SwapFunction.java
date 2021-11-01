import java.util.Scanner;

public class SwapFunction{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int x; 
        int y;
        
        System.out.print("Enter value a: ");
        x = sc.nextInt(); 
        System.out.print(x);
        
        System.out.print("\nEnter value b: ");
        y = sc.nextInt(); 
        System.out.print(y);
        
        swapFunction(x, y);
      
     
 }
 
 public static void swapFunction(int a, int b)
 {
     System.out.print("\nvalue before swap a: "+a+" b: " +b);
     int c = a; //whatever store in a will be store into c
     a = b; //whatever store in b will be store into a
     b = c; //whatever store in c will be store into b
     System.out.print("\nvalue after swap a: "+a+" b: " +b);
 }
 

}