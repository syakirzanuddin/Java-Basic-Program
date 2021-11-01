import java.util.Scanner;

public class Palindrome{
    public static void main(String args[]) {
     int r, reverse=0, a;
     Scanner sc= new Scanner(System.in);
     int n = sc.nextInt();
     a=n;
     
     while(n>0)
     {
        r=n%10;
        reverse=reverse*10+r;
        n=n/10;
     }
     
     if(a==reverse)
    {
        System.out.print(a+" = "+reverse+", so it is a Palindrome number");
        
    }else{
        System.out.print(a+" /= "+reverse+", so it is not palindrome number");
    }
     
    }
}