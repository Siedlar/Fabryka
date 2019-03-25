/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

/**
 *
 * @author Siedlar
 */
public class Kolo extends Figury {

    public Kolo( double r )
    {
        this.r = r;
    }
 
    public Kolo()
    {
        this( 0 );
    }
   
    private double r;
 
    public double getR()
    {
        return r;
    }
 
    public void setR(double r)
    {
        this.r = r;
    }
    @Override
    public double pole()
    {
        return r * r * Math.PI;
    }
    @Override
    public String nazwaFigury()
    {
        return "Kolo";
    }
    
}
