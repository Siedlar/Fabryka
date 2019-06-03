/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Siedlar
 */
public class IX extends Modele {
 double cena =3799.00;
    public IX() {
    }
    
 @Override
    public void wypiszCene() {
        
        System.out.println(cena);
    }

    @Override
    public void wypiszSpecyfikacje() {
        System.out.println("System operacyjny = iOS 11\nMaksymalna pamięć operacyjna= 3 GB RAM\nRozdzielczość matrycy= 12 Mpix\nRozdzielczość ekranu 2436 x 1125");
    }

    @Override
    public void zamow() {
        System.out.println("Dziekujemy za zlozenie zamowienia!!!");
    }
        @Override
    public String nazwa() {
       return "IPhone X";
    }

    @Override
    public double Cena() {
        return cena;
    }
}
