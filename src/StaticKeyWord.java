/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class StaticKeyWord {
    int x;
    static int y;
    static int z;
    static int k;
    
    static{
        y = 20;
        z = 36;
    }
    
    StaticKeyWord(String msg){
        System.out.println(msg);
    }
    
    int sum(){
        this.x =4;
        return x+y;
    }
    
    static int deduction(){
        //return x-y;
        //return sum()-y; 
        // can not call "this", static method only calls static field&method
        return z-k;
    }
}
