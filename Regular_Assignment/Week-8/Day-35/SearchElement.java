import java.util.ArrayList;
 class SearchElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        
        String elementToSearch = "Third";
       
        if (list.contains(elementToSearch)) {
            System.out.println("Element " + elementToSearch + " found at index " + list.indexOf(elementToSearch));
        } else {
            System.out.println("Element " + elementToSearch + " not found in the list");
        }
    }
}
