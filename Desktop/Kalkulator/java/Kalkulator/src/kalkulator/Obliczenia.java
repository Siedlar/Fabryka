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
  private double a;
  private double b;

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
   
         public double dodawanie(){
            return a+b;
        }
        public double odejmowanie(){
            return a-b;
        }
        public double mnozenie(){
            return a*b;
        }
        public double dzielenie(){
            return a/b;
        }
                public double potegowanie(){
            return Math.pow(a, b);
        }
                 public double pierwiastek(){
            return Math.sqrt(a);}
        
}
