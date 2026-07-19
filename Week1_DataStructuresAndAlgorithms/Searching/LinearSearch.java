public class LinearSearch {
    public static int search(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numbers = {10, 25, 30, 45, 50};
        int target = 30;
        System.out.print("Input Array: ");
        for (int number : numbers) System.out.print(number + " ");
        int index = search(numbers, target);
        System.out.println("\nTarget Element: " + target);
        System.out.println(index == -1 ? "Element not found" : "Element found at index: " + index);
    }
}
