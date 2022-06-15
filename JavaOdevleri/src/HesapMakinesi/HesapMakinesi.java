package HesapMakinesi;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ilk sayiyi giriniz : ");
		int n1 = input.nextInt();
		
		System.out.print("Ikinci sayiyi giriniz : ");
		int n2 = input.nextInt();
		
		System.out.println("1-Toplama\n2-Cikartma\n3-Carpma\n4-Bolme");
		System.out.print("Seciminizi yapiniz : ");
		int select = input.nextInt();
		
		switch(select) {
		case 1:
			System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
			break;
		case 2:
			System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
			break;
		case 3:
			System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
			break;
		case 4:
			if(n2 != 0) {
			System.out.println(n1 + " / " + n2 + " = " + (double)n1/n2);}
			else {
				System.out.println("HATA ! Bir sayinin 0'a bolumu tanimsizdir.");}
			break;
		default : 
			System.out.println("Hatali bir giris yaptiniz. Lutfen tekrar deneyiniz.");
		}
		input.close();
	}
	
}
