import java.util.Scanner; 

public class ReverseChar{
    public static void main(String args[]) {
  
  String sen; //declare for new sentence
  Scanner sc = new Scanner(System.in); // input scanner
  System.out.println("Insert sentence to be reversed");
  sen=sc.nextLine(); //input string element, nextInt() for integer element
  String reverse=""; //datatype store reverse elements 
  int length = sen.length(); //length of input sentence
  
      for(int i=length-1; i>=0; i--) //length-1 means 12-1, so it start from back, 
      {
          reverse = reverse+sen.charAt(i); //store reversed character in reverse datatype
      }
      
      System.out.print(reverse);
  }
}