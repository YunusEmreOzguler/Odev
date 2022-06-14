package KdvTutariHesaplama;

import java.util.Scanner;

public class KdvTutariHesaplama {

	/* Ödev
	Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
	tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.*/
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Hesaplanmasi istenen tutari giriniz :");
		int x = input.nextInt();
		
		if(x>1000) {
			System.out.println("KDV'siz Fiyat : " + x);
			System.out.println("KDV'li Fiyat : " + x*(1.08));
			System.out.println("KDV tutari : " + x*(0.08));
		}
		else if (x>0) {
			System.out.println("KDV'siz Fiyat : " + x);
			System.out.println("KDV'li Fiyat : " + x*(1.18));
			System.out.println("KDV tutari : " + x*(0.18));
		}
		else {
			System.out.println("Gecersiz bir tutar girdiniz.");
		}
		input.close();
	}
	
}
