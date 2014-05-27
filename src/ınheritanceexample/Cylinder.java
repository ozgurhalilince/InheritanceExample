/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ınheritanceexample;

/**
 *
 * @author stronex
 */
public class Cylinder extends Circle{
    
    private int x;
    private int y;
    private int r;
    private int h;  

    public Cylinder(int x, int y, int r, int h){
        super(x, y, r);
        this.x = x;
        this.y = y;
        this.r = r;
        this.h = h;
    }
    
    public double getVolume(){
        return (double)(Math.PI*r*r*h);
    }
    
    public double getSurfaceArea(){
        return ((double)(2*Math.PI*r*r) + (double)(2*Math.PI*r*h));    
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
    
    
}
