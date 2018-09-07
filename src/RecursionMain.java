/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class RecursionMain {
    public static void main(String[] args) {
        int a,b;
        Recursion r = new Recursion();
        a = r.vonglap(4);
         System.out.println("result from vonglap: "+a);
        b = r.dequy(1000);
          System.out.println("result from dequy: "+b);
    }
}
