import java.util.*;

public class Hashset{
    public static void main(String args[]){ 
        
        
    HashSet<String> hs = new HashSet<>(); //instance create HashSet, allocate memory using new
    HashSet<String> hs1 = new HashSet<>(); //different instance create HashSet, allocate memory using new

    hs.add("Malaysia"); //add() method to insert value to HashSet
    hs.add("Japan");
    hs.add("Australia");
    hs.add("Maldives");
    hs.add("Maldives"); //it will not read duplicate value
    hs.add(null); //allow null value, but only one
    
    hs1.add("Palestine");
    
    System.out.print("Element of HashSet: " + hs);
    System.out.print("\nElement of HashSet 1: " + hs1);
    
    hs.remove("Japan"); //remove Key Japan from hashset 
    System.out.print("\nHashSet after remove Japan: " + hs);
    
    System.out.print("\nIs Australia present? " + hs.contains("Maldives")); //check element exist or not? and it will return boolean
    
    System.out.print("\nIterate HashSet table: ");
    Iterator<String> it = hs.iterator();
    while(it.hasNext()){ //if any element is present it will return true, next() method will check if any element present or not
        System.out.print(it.next() + ", "); //once it is true, it will print the content
     }

    
    }
}