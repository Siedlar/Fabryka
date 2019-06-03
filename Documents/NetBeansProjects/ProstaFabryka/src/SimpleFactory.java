
import java.util.Scanner;


public class SimpleFactory {
	public SimpleFactory(){
            
        }

 public AbstractPhone utworzTelefon( )
 {
     System.out.println("Wybierz marke telefonu\n1.Samsung\n2.Sony\n3.Xiaomi\n4.Huwaei\n5.HTC\n6.Apple");
     Scanner in=new Scanner(System.in);
 int nazwa = in.nextInt();
 switch(nazwa)
 {
 case 1 : return new Samsung();
 case 2 : return new Sony();
 case 3 : return new Xiaomi();
 case 4 : return new Huawei();
 case 5 : return new HTC();
 case 6: return new Apple();
 }
 return null;
 }
}

		
	
