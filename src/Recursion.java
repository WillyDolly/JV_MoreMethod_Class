/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class Recursion {
    int vonglap(int n){
        int result = 1;
        for(int i=1;i<=n;i++){
            result = result*i;
        }
        return result;
    }
    
    int dequy(int n){
        int result;
        if(n == 1) return 1;
        result = dequy(n-1)+n;
        System.out.println("n = "+n);
        System.out.println("result: "+result);
        return result;
    }
}
