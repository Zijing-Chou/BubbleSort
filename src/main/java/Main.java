public class Main {
    public static void main(String[] args) {
        int[] array = {0, 8, 3, 6, 7, 9};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(array);
        for (int i : array) {
            System.out.print(i + ",");
        }
    }
}
