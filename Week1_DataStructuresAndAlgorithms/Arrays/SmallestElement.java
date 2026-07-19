public class SmallestElement {
    public static int findSmallest(int[] numbers) {
        int smallest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) smallest = numbers[i];
        }
        return smallest;
    }
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 89, 34};
        System.out.print("Input Array: ");
        for (int number : numbers) System.out.print(number + " ");
        System.out.println("\nSmallest Element: " + findSmallest(numbers));
    }
}
