public class RotateArray {
    public static void rotateLeft(int[] numbers, int positions) {
        positions = positions % numbers.length;
        int[] rotated = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            rotated[i] = numbers[(i + positions) % numbers.length];
        }
        for (int i = 0; i < numbers.length; i++) numbers[i] = rotated[i];
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int positions = 2;
        System.out.print("Input Array: ");
        for (int number : numbers) System.out.print(number + " ");
        rotateLeft(numbers, positions);
        System.out.print("\nArray After Left Rotation by " + positions + ": ");
        for (int number : numbers) System.out.print(number + " ");
    }
}
