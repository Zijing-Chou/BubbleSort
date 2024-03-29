public class Main {
    public static void main(String[] args) {
        int[] array = {9, 7 , 5 , 6, 3, 1};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(array);
        for (int i=0;i<=6;i++) {
            System.out.print(i + ",");
        }
    }
}
