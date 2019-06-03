/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Siedlar
 */
public class XZ3 extends Modele{
double cena =2398.00;
    public XZ3() {
    }
    @Override
    public void wypiszCene() {
    
          
         
        System.out.println(cena);
    }

    @Override
    public void wypiszSpecyfikacje() {
        System.out.println("System operacyjny = Android 9.0 Pie\nModel procesora = Qualcomm Snapdragon 845\nMaksymalna pamięć operacyjna = 4 GB RAM\nRozdzielczość ekranu = 2880 x 1440 piseli");
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
       return "Sony Xperia XZ3";
    }
}
