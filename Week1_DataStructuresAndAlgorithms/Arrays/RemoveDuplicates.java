public class RemoveDuplicates {
    public static int removeDuplicates(int[] numbers) {
        int uniqueIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != numbers[uniqueIndex]) {
                uniqueIndex++;
                numbers[uniqueIndex] = numbers[i];
            }
        }
        return uniqueIndex + 1;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 2, 3, 4, 4, 5};
        System.out.print("Sorted Input Array: ");
        for (int number : numbers) System.out.print(number + " ");
        int newLength = removeDuplicates(numbers);
        System.out.print("\nArray Without Duplicates: ");
        for (int i = 0; i < newLength; i++) System.out.print(numbers[i] + " ");
    }
}
