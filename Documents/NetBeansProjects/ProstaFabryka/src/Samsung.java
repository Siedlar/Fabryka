
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
public class Samsung  extends AbstractPhone{
    public Samsung() {
       
    }

    @Override
    public void wypiszDane() {
         System.out.println("Wybrałeś telefon marki Samsung");
    }

   
    @Override
    public Modele wybierzModel() {
        System.out.println("Wybierz model telefonu.\n1.S10\n2.Note4");
        Scanner in=new Scanner(System.in);
        int liczba=in.nextInt();
        switch(liczba){
            case 1: return new S10();
            case 2: return new Note4();
        }
        return null;
    }

}
