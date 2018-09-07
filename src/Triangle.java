/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class Triangle extends TwoDShape{
    private String style;
    Triangle(){
        super();
        style = "undetermined";
    }
    Triangle(String s,double w,double h){
        super(w,h);
        style = s;
    }
    Triangle(double x){
        super(x);
        style = "dac";
    }
    Triangle(Triangle tri){
        super(tri);
        style = "object";
    }
    double area(){
        return (getWidth() * getHeight())/2;
    }
    
    void showStyle(){
        System.out.println("style: " + style);
    }
}
