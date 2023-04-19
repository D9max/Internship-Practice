import java.util.*;

class ArrayListExample {
  public static void main(String args[]) {
    List<Object> list1 = new ArrayList<Object>();
    list1.add(123);
    list1.add("laitha");
    list1.add(56.75f);
    System.out.println(list1);
    for (Object obj : list1) {
      System.out.println(obj);
    }

    List<String> list2 = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);
    list2.add(sc.next());
    list2.add(sc.next());
    list2.add(sc.next());
    System.out.println(list2);
    for (String str : list2) {
      System.out.println(str);
    }

    List<Integer> list3 = new ArrayList<Integer>();
    list3.add(123);
    list3.add(124);
    list3.add(127);
    list3.add(10);
    System.out.println(list3);
    for (Integer i : list3) {
      System.out.println(i);
    }
    list3.set(1, 27);
    list3.remove(0);
    System.out.println(list3);
    System.out.println(list3.indexOf(10));

    List<Float> list4 = new ArrayList<Float>();
    list4.add(sc.nextFloat());
    list4.add(sc.nextFloat());
    list4.add(sc.nextFloat());
    list4.add(sc.nextFloat());
    System.out.println(list4);
    for (Float i : list4) {
      System.out.println(i);
    }
    list4.set(1, 1.1f);
    System.out.println(list4);

    List<Integer> list5 = new ArrayList<Integer>();
    list5.add(123);
    list5.add(124);
    list5.add(127);
    System.out.println(list5);
    for (Integer i : list5) {
      System.out.println(i);
    }

    List<Float> list6 = new ArrayList<Float>();
    list6.add(23.445f);
    list6.add(12.34f);
    list6.add(45.67f);
    list6.add(78.90f);
    System.out.println(list6);
    System.out.println(list6.get(2));
    list6.set(1, 23.45f);

    System.out.println(list6.indexOf(45.67f));
    System.out.println(list6);
    List<Float> list7 = new ArrayList<Float>();
    list7.addAll(list6);
    System.out.println(list7);

    List<String> fruits = new ArrayList<String>();
    fruits.add("Orange");
    fruits.add("apple");
    fruits.add("Mango");
    int count = 0, index = 0;
    for (String str : fruits) {
      if (str.equals("apple")) {
        count++;
        index = fruits.indexOf("apple");
        break;
      }
    }
    if (count == 1) {
      System.out.println("found at position " + index);
    } else {
      System.out.println("not found");
    }

    List<Integer> ls = new ArrayList<Integer>();
    System.out.println("enter elements");
    for (int i = 0; i < 5; i++) {
      ls.add(sc.nextInt());
    }
     System.out.println(ls);
    System.out.println("even numbers are:");
     for(Integer num:ls){
       if(num%2==0){
         System.out.println(num);
       }
     }
  }
}
