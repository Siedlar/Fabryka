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
   public int a,b,c;
    public void wyswietl(){
        System.out.print("Witamy w twoim kalkulatorze!!!\n1.Figury\n2.Proste Obliczenia\n->");
        b=pobierz.nextInt();
        if(b==1){
            System.out.println("Prosze o wybranie figury.\n1.Kwadrat\n2.Kolo\n->");
        }
         else if(b==2){
             System.out.println("Prosze o wybranie działania.\n1.Dodawanie\n2.Odejmowanie\n3.Mnożenie\n4.Dzielenie\n5.Potegowanie\n6.Pierwiastkowanie\n7.Exit\n");
          c=pobierz.nextInt();
        switch(c){
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
}
