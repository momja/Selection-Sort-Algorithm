/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

import java.util.Scanner;
import timer.Timer;
        
/**
 * This program measures how long it takes to sort an array of a user-specified
 * size with the selection sort algorithm.
 * @author maxomdal
 */
public class SelectionSortTimer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = in.nextInt();
        
        // Construct random array
        
        int[] a = ArrayUtil.randomIntArray(n, 100);
        SelectionSort sorter = new SelectionSort(a);
        
        // Use timer to time selection sort
        
        Timer timer = new Timer();
        
        timer.start();
        sorter.sort();
        timer.stop();
        
        System.out.println("Elapsed time: " + timer.getElapsedTime() + " milliseconds");
    }
}
