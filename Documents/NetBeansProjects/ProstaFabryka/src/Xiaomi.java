
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
public class Xiaomi extends AbstractPhone {

    public Xiaomi() {
    }

    @Override
    public void wypiszDane() {
       System.out.println("Wybrałeś telefon marki Xiaomi");
    }

    @Override
    public Modele wybierzModel() {
        System.out.println("Wybierz model telefonu.\n1.MI 9\n2.Redmi Note 7");
        Scanner in=new Scanner(System.in);
        int liczba=in.nextInt();
        switch(liczba){
            case 1: return new MI9();
            case 2: return new RedmiNote();
        }
        return null;
    }
    
}
