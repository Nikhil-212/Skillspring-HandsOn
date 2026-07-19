public class MissingNumber {
    public static int findMissingNumber(int[] numbers, int totalNumbers) {
        int expectedSum = totalNumbers * (totalNumbers + 1) / 2;
        int actualSum = 0;
        for (int i = 0; i < numbers.length; i++) actualSum += numbers[i];
        return expectedSum - actualSum;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 6};
        int totalNumbers = 6;
        System.out.print("Input Array: ");
        for (int number : numbers) System.out.print(number + " ");
        System.out.println("\nMissing Number: " + findMissingNumber(numbers, totalNumbers));
    }
}
