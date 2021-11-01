import java.util.HashMap;

public class Hashmap{
    public static void main(String args[]){ 
        
    HashMap<String, Integer> hm = new HashMap<>(); //create/initialize HashMap, new HashMap<> is to allocate the memory
    HashMap<String, Integer> hm1 = new HashMap<>(); //new hm1 
        
        hm.put("Syakir", 3000); //add element to hashmap
        hm.put("Wan", 5000);
        hm.put("Zakaria", 4000);
		hm.put("Zakaria", 6000);
        hm.put(null, 6000);
        
        hm1.put("Syakir", 3000); //add element to hashmap
        hm1.put("Wan", 5000);
        hm1.put("Zakaria", 4000);
        hm1.put("Amir", 6000);
        
        System.out.print("Element of hm: " + hm); //element of hm
        System.out.print("\nElement of hm1: " + hm1); //element of hm1
        
        System.out.print("\nHashMap Size: "+ hm.size());
        
        if(hm.containsKey("Syakir")){ //check if the particular key is present in hashmap or not, containsKey is boolen value
            Integer val = hm.get("Syakir"); //get() method is to pass the value
            System.out.print("\nValue for Key 'Syakir' is: " + val);
        }
    }
}