/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class OuterClass {
     int[] ch;
     
     OuterClass(int[] mang){
         ch = mang;
     }
     
     public void calculator(){
         InnerClass ic = new InnerClass();
         System.out.println("ch's max = "+ ic.Max());
         System.out.println("ch's min = "+ic.Min());
         System.out.println("ch's ave = "+ic.Ave());
     }
     
     class InnerClass{
         int min, max, ave;
         
         int Min(){
             min = ch[0];
             for(int i=0;i<ch.length;i++){// i is iteration variable
                 if(min>ch[i])
                     min = ch[i];
             }
             return min;
         }
         
         int Max(){
             max = ch[0];
             for(int i=0;i<ch.length;i++){
                 if(max < ch[i])
                     max = ch[i];
             }
             return max;
         }
         
         int Ave(){
             ave = 0;
             for(int i: ch) // i is value variable
                 ave = ave + i;
             return ave/ch.length;
         }
     }
}
