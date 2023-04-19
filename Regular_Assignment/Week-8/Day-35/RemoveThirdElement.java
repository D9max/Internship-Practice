import java.util.ArrayList;

 class RemoveThirdElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        
        System.out.println("Before removing third element: " + list);
        list.remove(2);
        System.out.println("After removing third element: " + list);
    }
}
