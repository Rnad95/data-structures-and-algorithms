/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Challenge26;

import Challenge26.dataStructure.SelectionSort;
import org.junit.jupiter.api.Test;


import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test void SelectionSortTest() {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr  ={8,4,23,42,16,15};
        int[] expected= {4,8,15,16,23,42};
        int[] actual = selectionSort.InsertSort(arr);
        assertTrue(Arrays.equals(expected,actual));

    }
    @Test void DontThroughIntoLastElement() {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr  ={8,4,23,42,16,52};
        int[] expected= {4,8,16,23,42,52};
        int[] actual = selectionSort.InsertSort(arr);
        assertTrue(Arrays.equals(expected,actual));

    }
    @Test void SortedArray() {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr  ={4,8,16,23,42,52};
        int[] expected= {4,8,16,23,42,52};
        int[] actual = selectionSort.InsertSort(arr);
        assertTrue(Arrays.equals(expected,actual));

    }
}
