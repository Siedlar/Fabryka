/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Siedlar
 */
public class Note4 extends Modele{
 double cena=500;
    public Note4() {
    }

 @Override
    public void wypiszCene() {
        
        System.out.println(cena);
      
    }

    @Override
    public void wypiszSpecyfikacje() {
        System.out.println("System operacyjny = Android 5.1\nModel procesora = Samsung Exynos 7 Octa 5433\nMaksymalna pamięć operacyjna	= 3 GB RAM\nRozdzielczość matrycy = 16 Mpix");
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
       return "Samsung Note 4";
    }
}
