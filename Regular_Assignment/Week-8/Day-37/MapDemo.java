// import java.util.HashMap;
// class MapDemo{
//   public static void main(String args[]){
//   HashMap<Integer,String> map=new HashMap<Integer,String>();
//     //map.replace(100,"mubarak");
//     //map.isEmpty();
//     //map.remove(203, "saheed");
//     map.put(201,"siraj");
//     map.put(202,"salman");
//     map.put(203,"saheed");
//     System.out.println(map);
//     for(Map.Entry m:map.entrySet()){
//       System.out.println(m.getKey()+" "+m.getValue());
//     }
//   }
// 

import java.util.HashMap;
import java.util.Map;

class MapDemo {
  public static void main(String[] args) {
    HashMap<Integer, String> map = new HashMap<>();

    map.put(201, "siraj");
    map.put(202, "salman");
    map.put(203, "saheed");

    System.out.println(map);
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
      int key = entry.getKey();
      String value = entry.getValue();
      System.out.println(key + " " + value);
    }
  }
}
