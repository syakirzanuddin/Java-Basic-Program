import java.util.Hashtable; //java.util: is a library, Hashtable is a class
import java.util.Iterator; 
import java.util.Scanner;

public class Hash{
    public static void main(String args[]) {
      
      Hashtable<Integer, String> ht = new Hashtable<>(); //define hashtable
      
      ht.put(1, "A"); //put() method insert value in hashtable
      ht.put(2, "B"); //key of type integer, value of type string
      ht.put(3, "C"); // 3 is map to c and so on
      ht.put(4, "D"); //null is invalid value for key and value || key should be unique
      ht.put(5, "D");
	  
      System.out.print(ht);
      
      String val = ht.get(3); //get() value of key 1, store in variable val
      System.out.println("\nvalue for key 3 is: " + val);
      
      //ht.remove(2); //remove(): to remove the value pointed to key 2
      
      System.out.print(ht); //remove key 2
      
      Iterator<Integer> itr = ht.keySet().iterator(); //print content of hashtable
      
      while(itr.hasNext()) //check if there is element in the next location
      {
          Integer key = itr.next(); //check if it present or not, if present it simply return
          String value = ht.get(key); //get value for particular key
          System.out.print("\nKey: "+key+" Value: "+value); //print key and value iterated
      }
    
    }
}