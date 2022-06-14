package NotOrtalamasiHesap;

import java.util.Scanner;

public class NotOrtalamasiHesaplama {
	/*
	Not Ortalaması Hesaplayan Program
	Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin 
	sınav puanlarını kullanıcıdan alan ve ortalamalarını 
	hesaplayıp ekrana bastırılan programı yazın.

	Ödev
	Aynı program içerisinde koşullu ifadeler kullanılarak, 
	eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , 
	küçük ise "Sınıfta Kaldı" yazsın.
	*/
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Matematik, Fizik, Kimya, Turkce, Tarih, Muzik derslerinden aldiginiz notlari giriniz... ");

		System.out.print("Matematik dersinden aldiginiz notu giriniz : ");
		int ma = input.nextInt();
		
		System.out.print("Fizik dersinden aldiginiz notu giriniz : ");
		int f = input.nextInt();
		
		System.out.print("Kimya dersinden aldiginiz notu giriniz : ");
		int k = input.nextInt();
		
		System.out.print("Turkce dersinden aldiginiz notu giriniz : ");
		int tu = input.nextInt();
		
		System.out.print("Tarih dersinden aldiginiz notu giriniz : ");
		int ta = input.nextInt();
		
		System.out.print("Muzik dersinden aldiginiz notu giriniz : ");
		int mu = input.nextInt();
		
		double average = (ma + f + k + tu + ta + mu)/6;
		
		if(average>60) {
			System.out.println("Notlarin ortalamasi : " + average );
			System.out.println("Tebrikler gectiniz");
			}
		else{
			System.out.println("Gecemediniz.");
			}
		
		input.close();
	}
	
	
}
