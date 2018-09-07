/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class Overload_MethodVarargs {
    static void vaTest(int ...v){
        System.out.println("int[]: "+v.length);
        System.out.println("Content: ");
        for(int i=0;i<v.length;i++){
            System.out.println("v["+i+"]: "+v[i]);
        }
    }
    
//     static void vaTest(int a,int ...v){
//        System.out.println("int[]: "+v.length);
//        System.out.println("Content: ");
//        for(int i=0;i<v.length;i++){
//            System.out.println("v["+i+"]: "+v[i]);
//        }
//    }
     
    static void vaTest(boolean ...b){
         System.out.println("Boolean: "+b.length);
        System.out.println("Content: ");
        for(int i=0;i<b.length;i++){
            System.out.println("b["+i+"]: "+b[i]);
        }
    }
    
    static void vaTest(String msg, int ...v){
         System.out.println(msg+v.length);
        System.out.println("Content: ");
        for(int i=0;i<v.length;i++){
            System.out.println("v["+i+"]: "+v[i]);
        }
    }
    
    
    public static void main(String[] args) {
        vaTest(true,false,true);
        vaTest("a little bit more: ",1,2,3);
        vaTest(34,23,67);
        //vaTest(); reference to vaTest is ambiguous
    }
}
