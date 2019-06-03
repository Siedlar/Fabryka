/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Siedlar
 */
public abstract class Modele {
    public abstract String nazwa();
    public abstract void wypiszCene();
    public abstract void wypiszSpecyfikacje();
    public abstract void zamow();
    public abstract double  Cena();
    @Override
    public String toString() {
        return nazwa()+ " "+ Cena()+" zł";
    }
  
}
