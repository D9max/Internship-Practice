import java.util.*;

 class JoinTwoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        list1.addAll(list2);
        
        System.out.println("Joined list: " + list1);
    }
}
