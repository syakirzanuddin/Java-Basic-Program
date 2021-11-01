import java.util.*;

public class LinkedHashmap{
    public static void main(String args[]){ 
        
    LinkedHashMap<String, String> lhm = new LinkedHashMap<>(); //create/initialize HashMap, new LinkedHashMap<> is to allocate the memory
  //instance of LinkedHashMap class
        
        lhm.put("Syakir", "Hensem"); //add element to linkedhashmap
        lhm.put("Wan", "Cute"); //put() is to insert value
        lhm.put("Zakaria", "Chubby");
        lhm.put("Amirul", "Menawan");
        lhm.put(null, "Menawan");
        lhm.put(null, "Marililcious"); //ignore previous null key, consider new value, can store only one null key
        
        System.out.print("Element of lhm: " + lhm); //element of lhm
        
        System.out.print("\nHashMap Size: "+ lhm.size()); //size of LinkedHashMap
        
        System.out.print("\nValue for Amirul: "+ lhm.get("Amirul")); //get the value for key Amirul
        
        System.out.print("\nIs there any 'Syakir' key: " + lhm.containsKey("Syakir")); //check is there any key of Syakir, it will return boolean value
        
        System.out.print("\nRemove Element of 'Zakaria' "+lhm.remove("Zakaria")); //remove element of zakaria, remove particular value
        
        System.out.print("\nNew LinkedHashMap: " + lhm); //print new LinkedHashMap
        
        
    }
}