import java.util.Scanner;

public class OverLoading{
    public static void main(String args[]) {
        
        OverLoading ol = new OverLoading(); //create object in main function to call function without static
        
        int x = 10; //initialize value x
        int y = 20; //initialize value y
         
        int z = 5; //initialize value z
        
        
        int rectangle = ol.area(x, y); //invoke area function for rectangle
        float circle = ol.area(z); //invoke area function for circle
        
        System.out.print("area of rectangle: " + rectangle);
        System.out.print("\narea of circle: " + circle);
 
 }
 
 public int area(int num1, int num2) //same function name, different data-type and different number of parameter
 {
     int result = num1*num2;
     return result;
 }
 
 public float area(int n)
 {
     float result = 3.14f*n*n;
     return result;
 }
 

}