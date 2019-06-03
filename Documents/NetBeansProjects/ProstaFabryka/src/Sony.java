
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
public class Sony extends AbstractPhone{

    public Sony() {
    }

    @Override
    public void wypiszDane() {
       System.out.println("Wybrałeś telefon marki Sony");
    }

    @Override
    public Modele wybierzModel() {
        System.out.println("Wybierz model telefonu.\n1.Sony Xperia XZ3\n2.Sony Xperia Z5");
        Scanner in=new Scanner(System.in);
        int liczba=in.nextInt();
        switch(liczba){
            case 1: return new XZ3();
            case 2: return new Z5();
        }
        return null;
    }
    
}
