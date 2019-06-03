/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Siedlar
 */
public class Z5 extends Modele{
     double cena =1999.00;
    public Z5() {
    }
    @Override
    public void wypiszCene() {
        System.out.println(cena);
    }

    @Override
    public void wypiszSpecyfikacje() {
        System.out.println("System operacyjny = Android 6.0\nModel procesora = Qualcomm Snapdragon 810 MSM8994\nRozdzielczość matrycy = 23 Mpix\nMaksymalna pamięć operacyjna = 3 GB RAM");
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
       return "Sony Xperia Z5";
    }
    
}
