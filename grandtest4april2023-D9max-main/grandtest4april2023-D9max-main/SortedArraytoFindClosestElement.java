/*Challenge- 6: 

You are given a sorted array of integers, and you are asked to find the closest element to a given target value. Write a modified version of the binary search algorithm that returns the closest element to the target value.If the element is not found or the array is empty, it should return -1. 

Here's a sample input and output for the above question: 

--------------------------------------------------------------- 

Test Case 1:  

Input: 

Sorted array: [1, 3, 6, 7, 9] 

Target value: 4 

Output: 

Closest element: 3 

Test Case 2: 

Input: 

Sorted array: [2, 4, 6, 8, 10] 

Target value: 9 

Output: 

Closest element: 8 

Test Case 3: 

Input: 

Sorted array: [4, 6, 8] 

Target value: 10 

Output: 

Closest element: -1 */

public class SortedArraytoFindClosestElement {
  public static int closestElement(int[] arr, int target) {
    if (arr == null || arr.length == 0) {
      return -1;
    }
    int left = 0;
    int right = arr.length - 1;
    int closest = -1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (arr[mid] == target) {
        return arr[mid];
      }
      if (closest == -1 || Math.abs(arr[mid] - target) < Math.abs(closest - target)) {
        closest = arr[mid];
      }
      if (arr[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return closest;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 3, 5, 6, 7, 9, 11 };
    int target1 = 8;
    System.out.println("Closest element to " + target1 + ": " + closestElement(arr1, target1));

    int[] arr2 = { 2, 4, 6, 8, 10 };
    int target2 = 3;
    System.out.println("Closest element to " + target2 + ": " + closestElement(arr2, target2));

    int[] arr3 = { 4, 6, 8, 15, 18 };
    int target3 = 10;
    System.out.println("Closest element to " + target3 + ": " + closestElement(arr3, target3));
  }
}
