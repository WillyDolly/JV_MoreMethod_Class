/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class StaticKeyWordMain {
    public static void main(String[] args) {
        System.out.println("StaticKeyWord.z = "+StaticKeyWord.z);
        StaticKeyWord s1 = new StaticKeyWord("Via static method,"
               + " a class can do sth before any objects constructed");
        StaticKeyWord s2 = new StaticKeyWord("ji");
        //Bien tinh nen dc goi qua ten lop
        //Bien the hien goi qua doi tuong
        s1.y = 23;// class's instance access all members
        s1.x = 12;
        System.out.println("s1.sum: "+s1.sum());
        s2.y = 1;
        System.out.println("s2.sum: "+s2.sum());
          System.out.println("s1.sum: "+s1.sum());
        StaticKeyWord.y = 34;// class can only access static members
          System.out.println("s2.sum: "+s2.sum());
          System.out.println("s1.sum: "+s1.sum());
    }
}
