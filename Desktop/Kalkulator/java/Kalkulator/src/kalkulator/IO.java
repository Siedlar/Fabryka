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
public class IO {
    Scanner in =new Scanner(System.in);
   
    public void wprowadzanieDanych(Obliczenia a){
        System.out.println("Podaj a:");
    int b=in.nextInt();
    a.setA(b);
      System.out.println("Podaj b:");
      int c=in.nextInt();
    a.setB(c);
    }
    
   
}
