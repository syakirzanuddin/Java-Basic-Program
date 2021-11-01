import java.util.Scanner;

public class IfElse {
    public static void main(String args[]) {
      int x;
      int y;
      
      Scanner sc = new Scanner(System.in);
      System.out.print("input x: ");
      x = sc.nextInt();
      System.out.print(x);
      
      System.out.print("\ninput y: ");
      y = sc.nextInt();
      System.out.print(y);
      
      
if(x > y)
{
      System.out.println("\nx is greater than y");
}else if(x < y){      
      System.out.println("\nx is less than y");
}else{
    System.out.println("\nx is equal to y");
}
    }
}