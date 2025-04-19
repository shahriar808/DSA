package sorting;

public class Insertion_Sort {
    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int[] arr) {
        Bubble_Sort.printArray(arr);
    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        System.out.println("Unsorted array");
        printArray(arr);
        insertionSort(arr);
        System.out.println("Sorted array");
        printArray(arr);
    }
}
