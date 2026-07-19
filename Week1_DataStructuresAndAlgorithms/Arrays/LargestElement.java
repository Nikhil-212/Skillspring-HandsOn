public class LargestElement {
    public static int findLargest(int[] numbers) {
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) largest = numbers[i];
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 89, 34};
        System.out.print("Input Array: ");
        for (int number : numbers) System.out.print(number + " ");
        System.out.println("\nLargest Element: " + findLargest(numbers));
    }
}
