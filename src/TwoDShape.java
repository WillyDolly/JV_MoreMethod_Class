/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class TwoDShape {
    private double width;
    private double height;
    TwoDShape(){
        width = height = 0.0;
    }
    TwoDShape(double w,double h){
        width = w;
        height = h;
    }
    TwoDShape(double x){
        width = height = x;
    }
    TwoDShape(TwoDShape tds){
        width = tds.width;
        height = tds.height;
    }
    double getWidth(){     return width;}
    double getHeight(){    return height;}
    void setWidth(double w){    width = w;}
    void setHeight(double h){   height = h;}
    void showDim(){
        System.out.println("chieu rong: "+width+" - chieu dai: "+height);
    }
}
