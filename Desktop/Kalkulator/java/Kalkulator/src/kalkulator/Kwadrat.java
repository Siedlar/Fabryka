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
public class Kwadrat extends Figury{

    private  double bok;
    public Kwadrat(int bok){
    this.bok=bok;
    }
    public Kwadrat(){
    this(0);
    }

    public double getBok() {
        return bok;
    }

    public void setBok(double bok) {
        this.bok = bok;
    }
    
    @Override
   public String nazwaFigury(){
   return "Kwadrat";
   }
   public double pole(){
   return bok*bok;
   }
}
