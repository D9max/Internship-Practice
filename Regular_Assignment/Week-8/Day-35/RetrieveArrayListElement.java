import java.util.ArrayList;

 class RetrieveArrayListElement {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("grape");
        
        int index = 2; 
        String fruit = fruits.get(index);
        
        System.out.println("The element at index " + index + " is: " + fruit);
    }
}
