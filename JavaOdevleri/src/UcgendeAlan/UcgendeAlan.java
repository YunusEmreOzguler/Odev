package UcgendeAlan;

import java.util.Scanner;

public class UcgendeAlan {

 /* Ödev
	Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.*/
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ucgenin kenar degerlerini giriniz.");
		System.out.print("1.Kenarin degeri : ");
		int a = input.nextInt();
		System.out.print("2.Kenarin degeri : ");
		int b = input.nextInt();
		System.out.print("3.Kenarin degeri : ");
		int c = input.nextInt();
	
	// Heron alan formulu ile devam edersek.
		
		double u = (a+b+c)/2;
		double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
		System.out.print("Ucgenin Alani : " + alan);
	
	// alan değerini double olarak bıraktım (int) e çevirmedim.
		input.close();
	}
}
