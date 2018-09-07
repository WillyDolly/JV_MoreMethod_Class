/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class EnhancedQueueMain {
    public static void main(String[] args) {
        EnhancedQueue q1 = new EnhancedQueue(5);
        char[] a = {'b','f','e','r','t','d'};
        EnhancedQueue q2 = new EnhancedQueue(a);
        for(int i=0;i<5;i++)
            q1.put((char)('A'+i));
        EnhancedQueue q3 = new EnhancedQueue(q1);
        
        System.out.println("q1: ");
        for(int i=0;i<5;i++)
            System.out.println(q1.get());
        
        System.out.println("q2: ");
        for(int i=0;i<6;i++)
            System.out.println(q2.get());
        
        System.out.println("q3: ");
        for(int i=0;i<5;i++)
            System.out.println(q3.get());
        
        q1.put('t');
    }
}
