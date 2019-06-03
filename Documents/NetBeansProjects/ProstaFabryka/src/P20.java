/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Siedlar
 */
public class P20 extends Modele{
double cena=1698.00;
    public P20() {
    }

   
    
 @Override
    public void wypiszCene() {
          
        System.out.println(cena);
       
    }

    @Override
    public void wypiszSpecyfikacje() {
        System.out.println("System operacyjny = Android 8.1 Oreo/nModel procesora = HiSilicon Kirin 970/nMaksymalna pamięć wewnętrzna = 128 GB/nMaksymalna pamięć operacyjna = 4 GB RAM");
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
       return "Huawei P20";
    }
}
