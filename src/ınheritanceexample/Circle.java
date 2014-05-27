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
public class Circle extends Point{

    private int r;
    
    public Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }

    public double getArea(){
        return (double)(Math.PI*r*r);
    }
    
    public double getPerimeter(){
        return (double)(2*Math.PI*r);
    }
    
    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

}
