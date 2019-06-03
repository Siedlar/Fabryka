
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Siedlar
 */
public class BurgerMaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      AbstractProduct burger;
List<AbstractProduct> zamowienia = new ArrayList<>();
//Podstawowy Burger
burger=new Burger();
zamowienia.add(burger);
//Burger z sosem BBQ i podwójnym serem
burger=new Burger();
burger=new SosBBQ(burger);
burger=new PodwojnySer(burger);
zamowienia.add(burger);
        for (int i = 0; i <zamowienia.size(); i++) {
            int numerZamowienia=i+1;
            System.out.println("Zamówienie "+numerZamowienia+":");
            System.out.println(zamowienia.get(i));
        }
    }
    
}
