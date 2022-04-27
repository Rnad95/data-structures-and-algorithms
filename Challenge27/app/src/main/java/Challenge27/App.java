package Challenge27;

import Challenge27.dataStructure.Mergesort;

public class App {

    public static void main(String[] args) {
        int[] arr  ={8,4,23,42,16,15};
        Mergesort mergesort =new Mergesort();
        int[] arr2 = mergesort.MergeSort(arr);
        mergesort.print(arr2);
    }
}
