
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
public class Huawei extends AbstractPhone{

    public Huawei() {
    }

    @Override
    public void wypiszDane() {
        System.out.println("Wybrałeś telefon marki Huawei");
    }

    @Override
     public Modele wybierzModel() {
        System.out.println("Wybierz model telefonu.\n1.P30\n2.P20 PRO");
        Scanner in=new Scanner(System.in);
        int liczba=in.nextInt();
        switch(liczba){
            case 1: return new P30();
            case 2: return new P20();
        }
        return null;
    }
    
}
