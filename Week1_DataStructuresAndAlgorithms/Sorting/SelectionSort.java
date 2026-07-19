public class SelectionSort {
    public static void sort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[smallestIndex]) smallestIndex = j;
            }
            int temporary = numbers[i];
            numbers[i] = numbers[smallestIndex];
            numbers[smallestIndex] = temporary;
        }
    }
    public static void main(String[] args) {
        int[] numbers = {29, 10, 14, 37, 13};
        System.out.print("Input Array: ");
        for (int number : numbers) System.out.print(number + " ");
        sort(numbers);
        System.out.print("\nSorted Array: ");
        for (int number : numbers) System.out.print(number + " ");
    }
}
