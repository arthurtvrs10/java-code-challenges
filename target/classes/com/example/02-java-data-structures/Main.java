public class Main {
    public static void main(String[] args){
        int[] array = {1, 7, 4, 9, 2, 3, 6, 8};

        MergeSortJava mg = new MergeSortJava();
        mg.mergeSort(array);

        for(int number : array){
            System.out.println(number +" ");
        }
    }
}
