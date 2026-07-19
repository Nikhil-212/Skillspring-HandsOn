public class BinarySearch {
    public static int search(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (numbers[middle] == target) return middle;
            if (numbers[middle] < target) low = middle + 1;
            else high = middle - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60};
        int target = 40;
        System.out.print("Sorted Input Array: ");
        for (int number : numbers) System.out.print(number + " ");
        int index = search(numbers, target);
        System.out.println("\nTarget Element: " + target);
        System.out.println(index == -1 ? "Element not found" : "Element found at index: " + index);
    }
}
