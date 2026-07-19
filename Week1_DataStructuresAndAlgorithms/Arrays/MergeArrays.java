public class MergeArrays {
    public static int[] merge(int[] first, int[] second) {
        int[] merged = new int[first.length + second.length];
        for (int i = 0; i < first.length; i++) merged[i] = first[i];
        for (int i = 0; i < second.length; i++) merged[first.length + i] = second[i];
        return merged;
    }
    public static void main(String[] args) {
        int[] first = {1, 3, 5};
        int[] second = {2, 4, 6};
        int[] merged = merge(first, second);
        System.out.print("First Array: ");
        for (int number : first) System.out.print(number + " ");
        System.out.print("\nSecond Array: ");
        for (int number : second) System.out.print(number + " ");
        System.out.print("\nMerged Array: ");
        for (int number : merged) System.out.print(number + " ");
    }
}
