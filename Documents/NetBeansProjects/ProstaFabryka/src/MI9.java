/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Siedlar
 */
public class MI9 extends Modele{
double cena =1689.00;
    public MI9() {
    }
    
 @Override
    public void wypiszCene() {
      
         
        System.out.println(cena);
    }

    @Override
    public void wypiszSpecyfikacje() {
        System.out.println("System operacyjny =Android 9 Pie\nModel procesora= Qualcomm Snapdragon 855\nRozdzielczość matrycy = 48 Mpix\nMaksymalna pamięć operacyjna = 12 GB RAM");
    }

    @Override
    public void zamow() {
        System.out.println("Dziekujemy za zlozenie zamowienia!!!");
    }
       @Override
    public String nazwa() {
       return "Xiaomi MI9";
    }

    @Override
    public double Cena() {
        return cena;
    }
}
