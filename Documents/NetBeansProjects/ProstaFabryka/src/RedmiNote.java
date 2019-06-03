/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Siedlar
 */
public class RedmiNote extends Modele{
   double cena =878.00;
    public RedmiNote() {
    }
   
 @Override
    public void wypiszCene() {
        
          
        
        System.out.println(cena);
    }

    @Override
    public void wypiszSpecyfikacje() {
        System.out.println("System operacyjny =A ndroid 9 Pie\nModel procesora = Qualcomm Snapdragon 660\nMaksymalna pamięć operacyjna = 6 GB RAM\nRozdzielczość matrycy = 48 Mpix");
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
       return "Xiaomi Redmi Note 7";
    }
}
