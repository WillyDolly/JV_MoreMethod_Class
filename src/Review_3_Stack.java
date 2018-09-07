/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class Review_3_Stack {
   private char[] stck;
   private int tos;
   
   Review_3_Stack(int size){
       stck = new char[size];
       tos = 0;
   }
   
   Review_3_Stack(Review_3_Stack sb){
       tos = sb.tos;
       stck = new char[sb.stck.length];
       for(int i=0;i<tos;i++){
           stck[i] = sb.stck[i];
       }
   }
   
   Review_3_Stack(char a[]){
       stck = new char[a.length];
       for(int i=0;i<a.length;i++){
           push(a[i]);
       }
   }
   
   void push(char c){
       if(tos == stck.length){
           System.out.println("Stack full");
           return;
       }
       stck[tos] = c;
       tos++;
   }
   
   char pop(){
       if(tos == 0){
           System.out.println("Stack empty");
           return (char) 0;
       }
       tos--;
       return stck[tos];
   }
}
