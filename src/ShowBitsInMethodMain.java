/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class ShowBitsInMethodMain {
    static long mask;
    public static void main(String[] args) {
        class ShowBits{// nested class inside a method
            int numbits;
            ShowBits(int n){
                numbits = n;
            }
            
            void show(long val){
                mask = 1;
                int spacer =0;
                mask<<=numbits-1;//mask moves left 
                for(;mask!=0;mask>>>=1){// mask moves right without mark saved
                    if((val & mask) !=0) System.out.print("1");
                    else System.out.print("0");
                    spacer++;
                    if(spacer%8 == 0){
                        System.out.print(" ");
                        spacer = 0;
                    }
                }
            }
        }
        
        for(byte b=0;b<10;b++){
            ShowBits sb = new ShowBits(8);
            System.out.println("binary number of "+b+" :");
            sb.show(b);
            System.out.println();
        }
    }
}
