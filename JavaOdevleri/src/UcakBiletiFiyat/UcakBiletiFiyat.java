package UcakBiletiFiyat;

import java.util.Scanner;

public class UcakBiletiFiyat {

//	Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
//	Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. 
//	İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
//	Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. 
//	Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
//	Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
//	Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
//	Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
//	Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
	
	public static void main(String[] args) {
		
	        int yas,mile,tercih;
	        double perMile,price,totalPrice;

	        Scanner input = new Scanner(System.in);

	        System.out.println("Lütfen Gideceğiniz Mesafeyi Giriniz :");
	        mile = input.nextInt();

	        System.out.println("Lütfen Yaşınızı Giriniz : ");
	        yas = input.nextInt();

	        System.out.println("Yolculuğunuz Tek Yön mü? Gidiş Geliş mi?\n1 - Tek Yön\n2 - Gidiş Geliş ");
	        tercih = input.nextInt();

	        perMile = 0.10;
	        price = perMile * mile;
	        if (tercih == 2){
	            System.out.println("İndirimsiz Fiyat :" + 2 * price);
	        }
	        if (tercih == 1){
	            System.out.println("İndirimsiz Fiyat :" + price);
	        }

	        if ((mile < 1) || (yas < 1) || (tercih < 1) || (tercih > 2) ){
	            System.out.println("Hatalı Giriş Yaptınız!!!");
	        } else if (yas < 12) {
	            totalPrice = (price * 0.5);
	            if (tercih == 2){
	                System.out.println("İndirimli Ücret :" + 2 * (totalPrice*0.8 ));
	            }

	        } else if (yas >= 12 && yas <= 24) {
	            totalPrice = price * 0.9;
	            if (tercih == 2){
	                System.out.println("İndirimli Ücret :" + 2 * (totalPrice*0.8 ));
	            }


	        } else if (yas >= 65) {
	            totalPrice = price * 0.7;
	            if (tercih == 2){
	                System.out.println("İndirimli Ücret :" + 2 * (totalPrice*0.8 ));
	            }

	        }else {
	            if (tercih == 2){
	                totalPrice = price;
	                System.out.println("Ücret :" + 2 * (totalPrice*0.8 ));
	            }else {
	                totalPrice = price;
	                System.out.println("Ücret :" + totalPrice);
	            }
	        }
		
		
		input.close();
	}
}
