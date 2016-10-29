/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

import java.util.Random;

/**
 * This class contains utility methods for array manipulation
 * @author maxomdal
 */
public class ArrayUtil {
    /**
     * Creates an array filled with random values
     * @param length the length of the array
     * @param n the umber of possible random values
     * @return an array filled with length numbers between 0 and n - 1
     */
    
    public static int[] randomIntArray(int length, int n) {
        int[] a = new int[length];
        for (int i = 0; i < a.length; i++)
            a[i] = generator.nextInt(n);
        
        return a;
    }
    
    private static Random generator = new Random();
}
