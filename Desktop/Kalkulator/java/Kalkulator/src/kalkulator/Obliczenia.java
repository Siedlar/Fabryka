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
public class Obliczenia {
  private int a;
  private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
   
         public int dodawanie(){
            return a+b;
        }
        public int odejmowanie(){
            return a-b;
        }
        public int mnozenie(){
            return a*b;
        }
        public int dzielenie(){
            return a/b;
        }
        
}
