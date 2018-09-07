/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class Review_6_Recursion {
    String str;
    Review_6_Recursion(String s){
        str = s;
    }
    
    void Backward(int index){
        if(index != (str.length()-1)) 
            Backward(index+1);
        System.out.print(str.charAt(index));
    }
}
