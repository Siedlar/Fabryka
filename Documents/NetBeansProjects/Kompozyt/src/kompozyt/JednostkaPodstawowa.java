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
public class JednostkaPodstawowa extends JednostkaWzorcowa  {
    public JednostkaPodstawowa(String nazwa,String typ){
    super(nazwa,typ);
    }
    @Override
    public void wypiszInfo(){
        System.out.println(typ+ " : "+nazwa);
    }
    
}
