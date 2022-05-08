package Challenge28.dataStructure;

public class Quicksort {

    public Quicksort() {
    }

    public void QuickSort(int arr[], int start, int end) {
        if (start < end) {
            int partitionIndex = partition(arr, start, end);

            QuickSort(arr, start, partitionIndex-1);
            QuickSort(arr, partitionIndex+1, end);
        }
    }
    private int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }


}
