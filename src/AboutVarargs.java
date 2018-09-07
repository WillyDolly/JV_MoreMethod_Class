/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class AboutVarargs {
     static void vaTest(String msg,int ... v){// int[]v distinct from int ... v
         System.out.println(msg+v.length);
         System.out.println("Content: ");
         
         for(int i=0;i<v.length;i++){
             System.out.println("arg "+i+" : "+v[i]);
         }
     }
     
     public static void main(String[] args) {
        vaTest("Length 1: ",10);
        vaTest("Length 3: ",1,2,3);
        vaTest("Length 0: ");
    }
}
