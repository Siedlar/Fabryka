/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kompozyt;

import java.util.ArrayList;

/**
 *
 * @author Siedlar
 */
public class JednostkaOrganizacyjna extends JednostkaWzorcowa {
    public JednostkaOrganizacyjna(String nazwa,String typ){
    super(nazwa,typ);
    }
    public void dodaj(JednostkaWzorcowa j){
    skladowe.add(j);
    }
    protected ArrayList<JednostkaWzorcowa> skladowe = new ArrayList();
      @Override
    public void wypiszInfo(){
        System.out.println(typ+ " : "+nazwa+ " zawiera: ");
          for(JednostkaWzorcowa j:skladowe){
          j.wypiszInfo();
          }
    }
}
