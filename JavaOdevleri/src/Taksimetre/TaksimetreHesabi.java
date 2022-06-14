package Taksimetre;

import java.util.Scanner;

public class TaksimetreHesabi {

	/*Taksimetre Programı
	Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

	Taksimetre KM başına 2.20 TL tutmaktadır.
	Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
	Taksimetre açılış ücreti 10 TL'dir.*/
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Yolculugun kac km oldugunu giriniz : ");
		int x = input.nextInt();
		
		double tutar = 10 + x*2.2 ;
		
		if(tutar<20) {
			System.out.println("Odeyeceginiz Ucret : 20 TL dir.");
		}
		else {
			System.out.println("Odeyeceginiz Ucret : " + tutar + " TL dir.");
		}
		input.close();
	}
}
