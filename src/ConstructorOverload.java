/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class ConstructorOverload {
    ConstructorOverload(int i){
        System.out.println("intepritor pick int: "+i);
    }
     ConstructorOverload(float f){
        System.out.println("intepritor pick float: "+f);
    }
    ConstructorOverload(double d){
        System.out.println("intepritor pick double: "+d);
    }
}
