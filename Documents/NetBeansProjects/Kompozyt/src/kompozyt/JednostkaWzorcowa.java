/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kompozyt;

/**
 *
 * @author Siedlar
 */
abstract class JednostkaWzorcowa {

    protected String nazwa;
    protected String typ;
    
    public JednostkaWzorcowa(String nazwa,String typ){
   
        this.nazwa=nazwa;
        this.typ=typ;
    }
    public abstract void wypiszInfo();
    
    
}
