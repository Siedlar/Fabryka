/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Siedlar
 */
public class Desire12 extends Modele {
  double cena=498.00;
    public Desire12() {
    }
    
 @Override
    public void wypiszCene() {
      
        System.out.println(cena);
    }

    @Override
    public void wypiszSpecyfikacje() {
        System.out.println("System operacyjny=Android 8.0 Oreo\nMaksymalna pamięć operacyjna= 3 GB RAM\nMaksymalna pamięć wewnętrzna=32 GB\nRozdzielczość matrycy=13 Mpix");
    }

    @Override
    public void zamow() {
        System.out.println("Dziekujemy za zlozenie zamowienia!!!");
    }

    @Override
    public String nazwa() {
        return "HTC Desire 12";
    }

    @Override
    public double Cena() {
        return cena;
    }
}
