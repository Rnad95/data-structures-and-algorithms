package Challenge26;

import Challenge26.dataStructure.SelectionSort;

public class App {

    public static void main(String[] args) {
        int[] arr  ={8,4,23,42,16,15};

        SelectionSort selectionSort=new SelectionSort();
        int[] arr2 = selectionSort.InsertSort(arr);
        selectionSort.print(arr2);
    }
}
