/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class Review_13_SumVarargs {

    static void Sum(int ...v){
        int sum = 0;
        for(int i=0;i<v.length;i++){
            sum = sum + v[i];
        }
        System.out.println("Sum of Varargs: "+sum);
    }
    
    public static void main(String[] args) {
        Sum(1,2,3);
    }
}
