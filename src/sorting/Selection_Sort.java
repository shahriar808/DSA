package sorting;

public class Selection_Sort {
    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    static void printArray(int[] arr) {
        Bubble_Sort.printArray(arr);
    }

    public static void main(String[] args) {
        int[] arr = {9, 4, 12, 10, 12, 4, 3, 9, 1};
        System.out.println("Unsorted array");
        printArray(arr);
        selectionSort(arr);
        System.out.println("Sorted array");
        printArray(arr);
    }
}
