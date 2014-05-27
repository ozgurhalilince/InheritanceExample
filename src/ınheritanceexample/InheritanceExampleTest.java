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
public class InheritanceExampleTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Cylinder cylinder = new Cylinder(3, 4, 5, 10);
        System.out.println("Cylinder's Features");
        System.out.println("Volume                 = " + cylinder.getVolume());
        System.out.println("Surface Area           = " + cylinder.getSurfaceArea());
        System.out.println("Its Circle's Area      = " + cylinder.getArea());
        System.out.println("Its Circle's Perimeter = " + cylinder.getPerimeter());
        System.out.println(cylinder.getCylindersCenterPoint());
        
        System.out.println(cylinder.getH());
        
    }

}
