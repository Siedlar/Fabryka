/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Siedlar
 */
public class I8 extends Modele {
  double cena=2524.00;
    public I8() {
    }
    
 @Override
    public void wypiszCene() {
      
        System.out.println(cena);
    }

    @Override
    public void wypiszSpecyfikacje() {
        System.out.println("System operacyjny=iOS 11\nMaksymalna pamięć operacyjna=2 GB RAM\nMaksymalna pamięć wewnętrzna=256 GB\nRozdzielczość matrycy	= 12 Mpix");
    }

    @Override
    public void zamow() {
        System.out.println("Dziekujemy za zlozenie zamowienia!!!");
    }

    @Override
    public String nazwa() {
          return "IPhone 8";
    }

    @Override
    public double Cena() {
       return cena;
    }
}
