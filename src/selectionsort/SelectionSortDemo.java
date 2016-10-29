/*
 * This program demonstrates the selection sort algorithm by sorting an array that is filled with random numbers.
 */
package selectionsort;

import java.util.Arrays;
/**
 *
 * @author maxomdal
 */
public class SelectionSortDemo {
    public static void main(String[] args) {
        int[] a = ArrayUtil.randomIntArray(20,100);
        System.out.println(Arrays.toString(a));
        
        SelectionSort sorter = new SelectionSort(a);
        sorter.sort();
        
        System.out.println(Arrays.toString(a));
    }
}
