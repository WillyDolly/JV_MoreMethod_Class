/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class MainOverload {
    public static void main(String[] args) {
        int i = 2143000000;
        double d = 5.9;
        byte b = 127;
        short s = 32123;
        long l = 9223000000000000000L;
        float f = 1456.5F;
        ConstructorOverload ol1 = new ConstructorOverload(i);
         ConstructorOverload ol2 = new ConstructorOverload(d);
          ConstructorOverload ol3 = new ConstructorOverload(b);
           ConstructorOverload ol4 = new ConstructorOverload(s);
            ConstructorOverload ol5 = new ConstructorOverload(l);
             ConstructorOverload ol6 = new ConstructorOverload(f);
    }
}
