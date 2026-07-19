public class ReverseArray {
    public static void reverse(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int temporary = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temporary;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.print("Input Array: ");
        for (int number : numbers) System.out.print(number + " ");
        reverse(numbers);
        System.out.print("\nReversed Array: ");
        for (int number : numbers) System.out.print(number + " ");
    }
}
