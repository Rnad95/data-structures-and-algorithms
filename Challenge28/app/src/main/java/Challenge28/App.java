package Challenge28;

import Challenge28.dataStructure.Quicksort;

public class App {

    public static void main(String[] args) {
        String str ="";
        Quicksort quicksort = new Quicksort();
        int[] arr = { 8,4,23,24,16};
        quicksort.QuickSort(arr,0,arr.length-1);

        for (int num: arr) {
            str+=num+" => ";
        }

        System.out.println(str);
    }
}
