package sorting;

public class Bubble_Sort {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
    static void printArray(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {9,4,12,10,12,4,3,9,1};
        System.out.println("Unsorted array");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("Sorted array");
        printArray(arr);
    }
}
