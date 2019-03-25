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
public class FabrykaFigur { 
    public Figury utworzFigure( int nrFigury )
    {
        switch( nrFigury )
        {
            case    1: return new Kwadrat();
            case    2: return new Kolo();
            default  : return null;
        }
    }
}
