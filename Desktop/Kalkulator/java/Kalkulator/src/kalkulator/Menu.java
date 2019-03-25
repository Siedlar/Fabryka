/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

import java.util.Scanner;

/**
 *
 * @author Siedlar
 */
public class Menu {
    Scanner pobierz=new Scanner(System.in);
   public int a;
    public void wyswietl(){
        System.out.println("Witamy w twoim kalkulatorze!!!\nProsze o wybranie działania.\n1.Dodawanie\n2.Odejmowanie\n3.Mnożenie\n4.Dzielenie\n5.Potegowanie\n6.Pierwiastkowanie\n7.Exit\n");
        a=pobierz.nextInt();
        switch(a){
            case 1: System.out.println("Wybrano dodawanie!");
            break;
             case 2: System.out.println("Wybrano odejmowanie!");
             break;
              case 3: System.out.println("Wybrano mnożenie!");
              break;
               case 4: System.out.println("Wybrano dzielenie!");
               break;
               case 5: System.out.println("Wybrano potegowanie!");
               break;
               case 6: System.out.println("Wybrano pierwiastkowanie!");
               break;
               default: System.exit(0);
               break;
        }
    }
}
