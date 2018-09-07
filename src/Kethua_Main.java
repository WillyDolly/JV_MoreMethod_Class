/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class Kethua_Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle("rong",1.2,3.4);
        Triangle t2 = new Triangle();
        Triangle t3 = new Triangle(5.6);
        
//        t1.setHeight(1.2);
//        t1.setWidth(3.4);
//        t1.style = "empty";
//        
//        t2.setHeight(3.6);
//        t2.setWidth(5.6);
//        t2.style = "condensed";
        
        System.out.println("thong tin t1:");
        t1.showDim();
        System.out.println("dien tich t1: "+t1.area());
        t1.showStyle();
        
        System.out.println("thong tin t2:");
        t2.showDim();
        System.out.println("dien tich t2: "+t2.area());
        t2.showStyle();
        
         System.out.println("thong tin t3:");
        t3.showDim();
        System.out.println("dien tich t2: "+t3.area());
        t3.showStyle();
    }
}
