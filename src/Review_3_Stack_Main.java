/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class Review_3_Stack_Main {
    public static void main(String[] args) {
        Review_3_Stack s1 = new Review_3_Stack(10);
        char ch[] = {'a','g','t','w','s'};
        Review_3_Stack s2 = new Review_3_Stack(ch);
        char c;
        int i;
        for(i=0;i<10;i++){
            s1.push((char)('A'+i));
        }
        Review_3_Stack s3 = new Review_3_Stack(s1);
        
        for(i=0;i<10;i++){
            c = s1.pop();
            System.out.print(c);
        }
        
        System.out.println("\n");
        for(i=0;i<ch.length;i++){
            c = s2.pop();
            System.out.print(c);
        }
        
        System.out.println("\n");
         for(i=0;i<10;i++){
            c = s3.pop();
            System.out.print(c);
        }
    }
}
