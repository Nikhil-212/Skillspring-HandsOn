public class SecondLargest {
    public static int findSecondLargest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] numbers = {10, 25, 8, 50, 40};
        System.out.print("Input Array: ");
        for (int number : numbers) System.out.print(number + " ");
        System.out.println("\nSecond Largest Element: " + findSecondLargest(numbers));
    }
}
