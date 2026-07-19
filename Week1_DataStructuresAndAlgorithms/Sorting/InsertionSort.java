public class InsertionSort {
    public static void sort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int current = numbers[i];
            int previous = i - 1;
            while (previous >= 0 && numbers[previous] > current) {
                numbers[previous + 1] = numbers[previous];
                previous--;
            }
            numbers[previous + 1] = current;
        }
    }
    public static void main(String[] args) {
        int[] numbers = {12, 11, 13, 5, 6};
        System.out.print("Input Array: ");
        for (int number : numbers) System.out.print(number + " ");
        sort(numbers);
        System.out.print("\nSorted Array: ");
        for (int number : numbers) System.out.print(number + " ");
    }
}
