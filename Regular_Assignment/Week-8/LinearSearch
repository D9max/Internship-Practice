import java.util.*;
class LinearSearchEx2
  {
    public static void linear(int arr[],int key)
    {
      int i;
    int count=0;
      for(i=0;i<arr.length;i++)
        {
          if(arr[i]==key)
          {
            count++;
            break;
          }
        }
      if(count>0)
      {
        System.out.println("element is found at "+i+ "position");
      }
      else
      {
        System.out.println("element not found");
      }
    }
    public static void main(String args[])
    {
      int arr[]={34,78,90,12,34,66,34};
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the key value you want to find");
      int key=sc.nextInt();
      linear(arr,key);
    }
  }