/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Siedlar
 */
public class U12 extends Modele {
double cena =1876.00;
    public U12() {
    }
    
 @Override
    public void wypiszCene() {
       
         
        System.out.println(cena);
    }

    @Override
    public void wypiszSpecyfikacje() {
        System.out.println("System operacyjny = Android 8.0 Oreo\nMaksymalna pamięć operacyjna =  6 GB RAM\nMaksymalna pamięć wewnętrzna = 256 GB\nModel procesora = Qualcomm Snapdragon 845");
    }

    @Override
    public void zamow() {
        System.out.println("Dziekujemy za zlozenie zamowienia!!!");
    }

    @Override
    public double Cena() {
        return cena;
    }
        @Override
    public String nazwa() {
       return "HTC U12";
    }
}
