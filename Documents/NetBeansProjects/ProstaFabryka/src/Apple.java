
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
public class Apple extends AbstractPhone{

    public Apple() {
    }

    @Override
    public void wypiszDane() {
        System.out.println("Wybrałeś telefon marki Apple");
    }

    @Override
     public Modele wybierzModel() {
        System.out.println("Wybierz model telefonu.\n1.IPhone X 64GB\n2.IPhone 8 64GB");
        Scanner in=new Scanner(System.in);
        int liczba=in.nextInt();
        switch(liczba){
            case 1: return new IX();
            case 2: return new I8();
        }
        return null;
    }
    
}
