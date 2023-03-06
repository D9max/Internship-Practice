import java.util.*;

public class Program3 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]= sc.nextInt();
      
    }
    int targetV=sc.nextInt();
    map<Intger.Integer>map=new Hashmap<>();
    for(int i=0;i<n;i++){
      int complement=targetV-arr[i];
      if(map.containskey(complements)){
      System.out.println(map.get(complement))
      System.out.println(i);
      return;
    }
    map.putof(arr[i],i);
  }
  System.out.println("no pair");
}
}