import java.util.LinkedHashSet;

public class LinkedHashset{ //it will maintain insertion order
    public static void main(String args[]){ 
        
        
    LinkedHashSet<String> lhs = new LinkedHashSet<>(); //instance create LinkedHashSet, allocate memory using new

    lhs.add("Malaysia"); //add() method to insert value to LinkedHashSet
    lhs.add("Japan");
    lhs.add("Australia");
    lhs.add("Maldives");
    lhs.add("Maldives"); //it will not read duplicate value
    lhs.add(null); //allow null value, but only one
    
    System.out.print("Element of LinkedHashSet: " + lhs);
    
    System.out.print("\nSize of LinkedHashSet: " + lhs.size()); //size of linkedHashSet
    
    System.out.print("\nIs Australia present? " + lhs.contains("Maldives")); //check element exist or not? and it will return boolean
    
    lhs.remove("Japan"); //remove Key Japan from hashset 
    System.out.print("\nLinkedHashSet after remove Japan: " + lhs);
    
    }
}