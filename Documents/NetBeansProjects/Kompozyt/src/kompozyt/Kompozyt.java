/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kompozyt;

import java.util.Scanner;

/**
 *
 * @author Siedlar
 */

public class Kompozyt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        JednostkaOrganizacyjna ekstraklasa= new JednostkaOrganizacyjna("Ekstraklasa","Liga");
         ekstraklasa.dodaj(new JednostkaPodstawowa("Legia Warszawa","Klub"));
         ekstraklasa.dodaj(new JednostkaPodstawowa("Lechia Gdańsk","Klub"));
         ekstraklasa.dodaj(new JednostkaPodstawowa("Piast Gliwice","Klub"));
         ekstraklasa.dodaj(new JednostkaPodstawowa("Cracovia","Klub"));
         ekstraklasa.dodaj(new JednostkaPodstawowa("Zagłebie Lubin","Klub"));
         ekstraklasa.dodaj(new JednostkaPodstawowa("Jagiellonia","Klub"));
         ekstraklasa.dodaj(new JednostkaPodstawowa("Pogoń Szczecin","Klub"));
         ekstraklasa.dodaj(new JednostkaPodstawowa("Lech Poznań","Klub"));
         ekstraklasa.dodaj(new JednostkaPodstawowa("Wisła Kraków","Klub"));
         ekstraklasa.dodaj(new JednostkaPodstawowa("Korona Kielce","Klub"));
         ekstraklasa.dodaj(new JednostkaPodstawowa("Miedź Legnica","Klub"));
         ekstraklasa.dodaj(new JednostkaPodstawowa("Górnik Zabrze","Klub"));
         ekstraklasa.dodaj(new JednostkaPodstawowa("Śląsk Wrocław","Klub"));
         ekstraklasa.dodaj(new JednostkaPodstawowa("Wisła Płock","Klub"));
         ekstraklasa.dodaj(new JednostkaPodstawowa("Arka Gdynia","Klub"));
         ekstraklasa.dodaj(new JednostkaPodstawowa("Zagłebie Sosnowiec ","Klub"));
         JednostkaOrganizacyjna premier= new JednostkaOrganizacyjna("Premier League","Liga");
         premier.dodaj(new JednostkaPodstawowa("Legia Warszawa","Klub"));
         premier.dodaj(new JednostkaPodstawowa("Lechia Gdańsk","Klub"));
         premier.dodaj(new JednostkaPodstawowa("Piast Gliwice","Klub"));
         premier.dodaj(new JednostkaPodstawowa("Cracovia","Klub"));
         premier.dodaj(new JednostkaPodstawowa("Zagłebie Lubin","Klub"));
         premier.dodaj(new JednostkaPodstawowa("Jagiellonia","Klub"));
         premier.dodaj(new JednostkaPodstawowa("Pogoń Szczecin","Klub"));
         premier.dodaj(new JednostkaPodstawowa("Lech Poznań","Klub"));
         premier.dodaj(new JednostkaPodstawowa("Wisła Kraków","Klub"));
         premier.dodaj(new JednostkaPodstawowa("Korona Kielce","Klub"));
         premier.dodaj(new JednostkaPodstawowa("Miedź Legnica","Klub"));
         premier.dodaj(new JednostkaPodstawowa("Górnik Zabrze","Klub"));
         premier.dodaj(new JednostkaPodstawowa("Śląsk Wrocław","Klub"));
         premier.dodaj(new JednostkaPodstawowa("Wisła Płock","Klub"));
         premier.dodaj(new JednostkaPodstawowa("Arka Gdynia","Klub"));
         premier.dodaj(new JednostkaPodstawowa("Zagłebie Sosnowiec ","Klub"));
         System.out.println("Wybierz Lige która chcesz zobaczyć:\n1.Ekstraklasa\n2.Premier League");
         int a=in.nextInt();
         switch(a){
             case 1:  ekstraklasa.wypiszInfo();
                 break;
                 
             case 2: premier.wypiszInfo();
                 break;
         }
       
         
         
    }
    
}
