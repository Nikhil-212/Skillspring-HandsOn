public class BubbleSort {
    public static void sort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temporary = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temporary;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22};
        System.out.print("Input Array: ");
        for (int number : numbers) System.out.print(number + " ");
        sort(numbers);
        System.out.print("\nSorted Array: ");
        for (int number : numbers) System.out.print(number + " ");
    }
}
