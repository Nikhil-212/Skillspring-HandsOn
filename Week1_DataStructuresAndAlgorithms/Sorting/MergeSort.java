public class MergeSort {
    public static void sort(int[] numbers, int left, int right) {
        if (left >= right) return;
        int middle = left + (right - left) / 2;
        sort(numbers, left, middle);
        sort(numbers, middle + 1, right);
        merge(numbers, left, middle, right);
    }
    public static void merge(int[] numbers, int left, int middle, int right) {
        int[] temporary = new int[right - left + 1];
        int first = left, second = middle + 1, index = 0;
        while (first <= middle && second <= right)
            temporary[index++] = numbers[first] <= numbers[second] ? numbers[first++] : numbers[second++];
        while (first <= middle) temporary[index++] = numbers[first++];
        while (second <= right) temporary[index++] = numbers[second++];
        for (int i = 0; i < temporary.length; i++) numbers[left + i] = temporary[i];
    }
    public static void main(String[] args) {
        int[] numbers = {38, 27, 43, 3, 9, 82, 10};
        System.out.print("Input Array: ");
        for (int number : numbers) System.out.print(number + " ");
        sort(numbers, 0, numbers.length - 1);
        System.out.print("\nSorted Array: ");
        for (int number : numbers) System.out.print(number + " ");
    }
}
