/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class EnhancedQueue {
    private char[] q;
    private int putloc, getloc;
    
    EnhancedQueue(int size){
        q = new char[size+1];
        putloc = getloc = 0;
    }
    //Create a Queue from another Queue
    EnhancedQueue(EnhancedQueue eq){
        putloc = eq.putloc;
        getloc = eq.getloc;
        q = new char[eq.q.length];
        for(int i= getloc+1;i<=putloc;i++)
            q[i] = eq.q[i];
    }
    //Create a Queue from a given array
    EnhancedQueue(char[] a){
        putloc = 0;
        getloc = 0;
        q = new char[a.length+1];
        for(int i = 0;i<a.length;i++) 
            put(a[i]);
    }
    
    void put(char c){
        if(putloc == q.length-1){
            System.out.println("queue full");
        return;
        }
        putloc++;
        q[putloc] = c;
    }
    
    char get(){
        if(getloc == putloc){
            System.out.println("queue empty");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}
