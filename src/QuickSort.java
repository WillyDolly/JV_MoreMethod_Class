/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class QuickSort {
    static void quicksort(char[] a){
        qs(a,0,a.length-1);
    }
    private static void qs(char[] items,int left,int right){
        int i,j;
        char x,y;
        i = left ; j = right;
        System.out.println("left: "+left+" - right: "+right);
        x = items[(left+right)/2];
        System.out.println("x :"+x);
        do{
            while((items[i]>x)&&(i<right)){
                i++;
                System.out.println("i :"+i);
            }
            while((x>items[j])&&(j>left)){
                j--;
                System.out.println("j :"+j);
            }
            
            if(i<=j){
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++; 
                j--;
                  System.out.println("i :"+i+" - j :"+j);
                  for(char c: items)
                      System.out.print(c+" ");
                  System.out.println();
            }
        }while(i<=j);
        
        if(left<j) qs(items,left,j);
        if(i<right) qs(items,i,right);
    }
}
