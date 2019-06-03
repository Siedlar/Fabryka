
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Siedlar
 */
public class HTC extends AbstractPhone{

    public HTC() {
    }

    @Override
    public void wypiszDane() {
       System.out.println("Wybrałeś telefon marki HTC");
    }

    @Override
     public Modele wybierzModel() {
        System.out.println("Wybierz model telefonu.\n1.U12+\n2.Desire 12");
        Scanner in=new Scanner(System.in);
        int liczba=in.nextInt();
        switch(liczba){
            case 1: return new U12();
            case 2: return new Desire12();
        }
        return null;
    }
    
}
