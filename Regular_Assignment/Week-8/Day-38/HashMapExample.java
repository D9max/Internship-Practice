import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        
        
        Map<String, Integer> hashMap = new HashMap<>();
        
     
        hashMap.put("John", 25);
        hashMap.put("Jane", 30);
        hashMap.put("Bob", 40);
   
        System.out.println(hashMap.get("John")); 
        System.out.println(hashMap.containsKey("Bob")); 
        hashMap.remove("Jane");
        
        
        for(String key : hashMap.keySet()) {
            System.out.println(key + " - " + hashMap.get(key));
        }
        
       
        for(Integer value : hashMap.values()) {
            System.out.println(value);
        }
        
       
        for(Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        
      
        System.out.println(hashMap.size());
        hashMap.clear();
        
     
        Map<String, Integer> newHashMap = new HashMap<>();
        newHashMap.putAll(hashMap);
    }
}
