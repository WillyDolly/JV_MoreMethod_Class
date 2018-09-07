/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class QuickSortMain {
    public static void main(String[] args) {
        char[] a = {'x','a','r','p','j','i'};
        System.out.println("Initial array a: ");
         for(char c: a)
            System.out.print(c+" ");
        QuickSort.quicksort(a);
        System.out.println("Sorted array a: ");
        for(char c: a)
            System.out.print(c+" ");
    }
}
