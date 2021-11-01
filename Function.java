import java.util.Scanner;

public class Function{
    public static void main(String args[]) {
      
      Function fc = new Function(); //to call function without static, create object in main function
      
      int x = 10; 
      int y = 20; 
      
      int get_result = fc.add(x, y); //parse value of x and y into parameter of add() function
    
      System.out.print(get_result);
 }
 
 public int add(int a, int b) //no void, it has return value 
 {
     int result = a + b;
     return result;
 }

}