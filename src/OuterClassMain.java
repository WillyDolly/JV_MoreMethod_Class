/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class OuterClassMain {
    public static void main(String[] args) {
        int[] num = {3,6,1,2,5};
        OuterClass oc = new OuterClass(num);
        oc.calculator();
    }
}
