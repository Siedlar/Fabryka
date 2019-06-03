/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Siedlar
 */
public class S10 extends Modele{
 double cena =2837.00;
    public S10() {
    }

    @Override
    public void wypiszCene() {
     
      
        System.out.println(cena);
    }

    @Override
    public void wypiszSpecyfikacje() {
        System.out.println("System operacyjny = Android 9 Pie\nModel procesora = Samsung Exynos 9820\nMaksymalna pamięć operacyjna = 8 GB RAM\nMaksymalna pamięć wewnętrzna = 512 GB");
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
       return "Samsung S10";
    }
}
