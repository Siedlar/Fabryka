
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FabrykaMain {


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Sklep internetowy oferujący telefony w sprzedaży.");
        List<Modele> zamowienia = new ArrayList<>();
       SimpleFactory f=new SimpleFactory();
       int a=1;
       int b=0;
        double suma=0;
       do{
        AbstractPhone telefon = f.utworzTelefon();
      telefon.wypiszDane();
     Modele model=telefon.wybierzModel();
     do{
           System.out.println("1.Wypisz cene.\n2.Pokaz specyfikacje\n3.Dodaj do zamowienia.\n4.Koniec");
           b=in.nextInt();
           if(b==1){
           model.wypiszCene();
           }
           else if(b==2){
           model.wypiszSpecyfikacje();
           }
           else if(b==3){
               System.out.println("Telefon dodany do zamowienia!");
               suma+=model.Cena();
           zamowienia.add(model);
           }
     }while(b!=4);
     System.out.println("1.Kontynuuj zakupy.\n2.Zakoncz zakupy");
       a=in.nextInt();
     if(a==2){
     }  }while(a!=2);
   
        System.out.println("Twoje zamowienie to:");
      for (int i = 0; i <zamowienia.size(); i++) {
            System.out.println(zamowienia.get(i));
        }
        System.out.println("Do zapłaty jest "+suma+"\nDziekujemy za złożenie zamówienia !!!");
      
    }
    
}
