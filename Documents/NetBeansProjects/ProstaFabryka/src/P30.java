/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Siedlar
 */
public class P30 extends Modele{
 double cena =3333.00;
    public P30() {
    }

   
    
 @Override
    public void wypiszCene() {
        
        
        System.out.println(cena);
    }

    @Override
    public void wypiszSpecyfikacje() {
        System.out.println("System operacyjny = Android 9 Pie\nModel procesora = HiSilicon Kirin 980\nMaksymalna pamięć operacyjna = 6 GB RAM/nMaksymalna pamięć wewnętrzna = 128 GB");
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
       return "Huawei P30";
    }
}
