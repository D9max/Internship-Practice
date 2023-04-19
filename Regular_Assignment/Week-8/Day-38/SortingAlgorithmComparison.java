import java.util.Arrays;

public class SortingAlgorithmComparison {
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        int comparisons = 0;
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comparisons++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
        }
        System.out.println("Bubble Sort Comparisons: " + comparisons);
        System.out.println("Bubble Sort Swaps: " + swaps);
        return arr;
    }
     static int[] insertionSort(int[] arr) {
        int n = arr.length;
        int comparisons = 0;
        int swaps = 0;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                comparisons++;
                arr[j + 1] = arr[j];
                j = j - 1;
                swaps++;
            }
            arr[j + 1] = key;
        }
        System.out.println("Insertion Sort Comparisons: " + comparisons);
        System.out.println("Insertion Sort Swaps: " + swaps);
        return arr;
    }
     static int[] quickSort(int[] arr, int low, int high) {
        int comparisons = 0;
        int swaps = 0;
        if (low < high) {
            int pivot = arr[high];
            int i = (low - 1);
            for (int j = low; j < high; j++) {
                comparisons++;
                if (arr[j] < pivot) {
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    swaps++;
                }
            }
            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;
            swaps++;
            int pi = i + 1;
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
        System.out.println("Quicksort Comparisons: " + comparisons);
        System.out.println("Quicksort Swaps: " + swaps);
        return arr;
    }
     static int[] mergeSort(int[] arr, int l, int r) {
        int comparisons = 0;
        int swaps = 0;
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            int[] L = Arrays.copyOfRange(arr, l, m + 1);
            int[] R = Arrays.copyOfRange(arr, m + 1, r + 1);
            int i = 0, j = 0, k = l;
            while (i < L.length && j < R.length) {
                comparisons++;
                if (L[i] <= R[j]) {
                    arr[k++] = L[i++];
                } else {
                    arr[k++] = R[j++];
            swaps++;
            }
            }
            while (i < L.length) {
            arr[k++] = L[i++];
            }
            while (j < R.length) {
            arr[k++] = R[j++];
            }
            }
            System.out.println("Mergesort Comparisons: " + comparisons);
            System.out.println("Mergesort Swaps: " + swaps);
            return arr;
            }
            public static void main(String[] args) {
            int[] arr = { 10, 7, 8, 9, 1, 5 };
            System.out.println("Original array: " + Arrays.toString(arr));
            System.out.println();
            
            int[] arr1 = bubbleSort(arr.clone());
            System.out.println("Bubble Sorted array: " + Arrays.toString(arr1));
            System.out.println();
            
            int[] arr2 = insertionSort(arr.clone());
            System.out.println("Insertion Sorted array: " + Arrays.toString(arr2));
            System.out.println();
            
            int[] arr3 = quickSort(arr.clone(), 0, arr.length - 1);
            System.out.println("Quicksort Sorted array: " + Arrays.toString(arr3));
            System.out.println();
            
            int[] arr4 = mergeSort(arr.clone(), 0, arr.length - 1);
            System.out.println("Mergesort Sorted array: " + Arrays.toString(arr4));
        }
        }