/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class fail_softDemo {
    public static void main(String[] args) {
        int x;
        FailSoftArray fsa = new FailSoftArray(5,-1);
        for(int i=0;i<(fsa.length *2);i++)
           if(!fsa.put(i,i*10))
                   System.out.println("array out of bound");
        
        for(int i=0;i<(fsa.length *2);i++){
           x = fsa.get(i);
           if(x!=-1)
                System.out.println("q["+i+"] = " +x);
           else
                System.out.println("out of bound");
        }   
    }
}
