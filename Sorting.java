import java.util.Scanner;
import java.util.Arrays;

public class Sorting{
   
    public static void main(String[] args)
    {
  int arr[] = {1, 8, 2, 3, 9, 4, 5};
  Arrays.sort(arr);
  System.out.print("ascending order: ");
  for(int i=0; i<arr.length; i++){ //i<=arr.length-1;
      System.out.print(" "+arr[i]);
  }
  
     
  }
}