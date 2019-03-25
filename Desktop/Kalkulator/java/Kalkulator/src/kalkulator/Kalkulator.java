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
      aIO.wprowadzanieDanych(aobliczenia);
      if(amenu.a==1){
      
               System.out.println(aobliczenia.dodawanie());
      }
      else if(amenu.a==2){
      
      System.out.println(aobliczenia.odejmowanie());
      }
      else if(amenu.a==3){
      
      System.out.println(aobliczenia.mnozenie());
      }
      else if(amenu.a==4){
      System.out.println(aobliczenia.dzielenie());
      
      }
      }
    }
    

