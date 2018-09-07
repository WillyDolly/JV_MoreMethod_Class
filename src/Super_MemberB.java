/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class Super_MemberB extends Super_Member{
    int i;
    
    Super_MemberB(int a, int b){
        super.i = a;
        i = b;
    }
    
    void showValue(){
        System.out.println("super i: "+super.i);
        System.out.println("sub i: "+i);
    }
}
