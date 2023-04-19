import java.util.ArrayList;

 class UpdateArrayListElement {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("grape");
        
        int index = 1; 
        String newFruit = "kiwi";
        
        fruits.set(index, newFruit);
        
        System.out.println("The updated ArrayList is: " + fruits);
    }
}
