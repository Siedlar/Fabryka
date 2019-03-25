/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

/**
 *
 * @author Siedlar
 */
public class Kalkulator {

    public static void main(String[] args) {
      Menu amenu=new Menu();
      amenu.wyswietl();
      Obliczenia aobliczenia=new Obliczenia();
      IO aIO=new IO();
      if(amenu.b==1){
      Figury f=null;
       FabrykaFigur fabryka = new FabrykaFigur();
       int k=aIO.ustawF();
     f=fabryka.utworzFigure(k);
     aIO.wprowadzaniedoF(f);
    
          System.out.println("Pole"+ f.nazwaFigury()+ " wynosi:  " +f.pole());
      }
      else if(amenu.b==2){
          aIO.wprowadzanieDanych(aobliczenia);
        if(amenu.c==1){
      
               System.out.println(aobliczenia.dodawanie());
      }
      else if(amenu.c==2){
      
      System.out.println(aobliczenia.odejmowanie());
      }
      else if(amenu.c==3){
      
      System.out.println(aobliczenia.mnozenie());
      }
      else if(amenu.c==4){
      System.out.println(aobliczenia.dzielenie());
      
      }
      else if(amenu.c==5){
       System.out.println(aobliczenia.potegowanie());
      }
       else if(amenu.c==6){
       System.out.println(aobliczenia.pierwiastek());
      }
      }}
    }
    

