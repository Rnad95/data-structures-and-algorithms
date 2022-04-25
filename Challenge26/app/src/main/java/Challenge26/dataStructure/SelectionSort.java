package Challenge26.dataStructure;

public class SelectionSort {

    public SelectionSort() {
    }

    public int[] InsertSort(int[] arr)
    {
        for (int i = 1; i <arr.length ; i++) {
            int j = i-1;
            int temp = arr[i];
            while (j>=0 && temp<arr[j]){
                arr[j+1] = arr[j];
                j = j-1;
                arr[j+1] = temp;
            }
            if(i == arr[arr.length-1]){
                return arr;
            }
        }
        return arr;
    }

    public int[] print(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+"    ");
        }
        return arr;
    }
}
