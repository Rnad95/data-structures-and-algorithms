package Challenge27.dataStructure;

import java.util.Arrays;

public class Mergesort {

    public Mergesort() {
    }

    public int[] MergeSort(int[] arr)
    {
       int n = arr.length;
       if(n>1){
           int mid = n/2;
           int[] left =  Arrays.copyOfRange(arr, 0, mid);
           int[] right =  Arrays.copyOfRange(arr, mid, arr.length);
           MergeSort(left);
           MergeSort(right);
           Merge(left,right,arr);
       }
        return arr;
    }

    public int[] Merge(int[] left, int[] right, int[] arr){
        int i=0,j=0,k = 0;
        while(j<left.length && k<right.length){
            if(left[j]<right[k]){
                arr[i++] = left[j++];
            }
            else{
                arr[i++] = right[k++];
            }
        }
        while(j<left.length){
            arr[i++] = left[j++];
        }
        while(k<right.length){
            arr[i++] = right[k++];
        }
       return arr;
    }

    public void  print(int[] arr) {
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
    }

}
