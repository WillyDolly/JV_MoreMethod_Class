/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class FailSoftArray {
    private int q[];
    private int errval;
    public int length;
    
    public FailSoftArray(int size,int val){
        q = new int[size];
        errval = val;
        length = size;
    }
    
    public int get(int index){
        if(ok(index)) return q[index];
        else return errval;
    }
    public boolean put(int index,int val){
        if(ok(index)){
           q[index] = val;
           return true;
        }
        else return false;
    }
    public boolean ok(int index){
        if(index>=0 && index<length) return true;
        else return false;
    }
    
}
