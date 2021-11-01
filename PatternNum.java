import java.util.Scanner;

public class PatternNum{
    public static void main(String args[]) {
      
      int n = 15; 
      
      for(int i = 5; i <= n; i=i+5) //outer for loop determine number of row
    {
        for(int j = 1; j <= i; j++) //number of star to be printed
        {
            System.out.print(j + " ");
        }
        System.out.println();
    }
 }

}