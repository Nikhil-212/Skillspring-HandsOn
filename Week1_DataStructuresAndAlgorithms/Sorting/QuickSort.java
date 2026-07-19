public class QuickSort {
    public static void sort(int[] numbers, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(numbers, low, high);
            sort(numbers, low, pivotIndex - 1);
            sort(numbers, pivotIndex + 1, high);
        }
    }
    public static int partition(int[] numbers, int low, int high) {
        int pivot = numbers[high];
        int smallerIndex = low - 1;
        for (int i = low; i < high; i++) {
            if (numbers[i] <= pivot) {
                smallerIndex++;
                int temporary = numbers[smallerIndex];
                numbers[smallerIndex] = numbers[i];
                numbers[i] = temporary;
            }
        }
        int temporary = numbers[smallerIndex + 1];
        numbers[smallerIndex + 1] = numbers[high];
        numbers[high] = temporary;
        return smallerIndex + 1;
    }
    public static void main(String[] args) {
        int[] numbers = {10, 7, 8, 9, 1, 5};
        System.out.print("Input Array: ");
        for (int number : numbers) System.out.print(number + " ");
        sort(numbers, 0, numbers.length - 1);
        System.out.print("\nSorted Array: ");
        for (int number : numbers) System.out.print(number + " ");
    }
}
