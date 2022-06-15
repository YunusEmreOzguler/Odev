package ManavKasa;

import java.util.Scanner;

public class ManavKasa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Armut Kac Kilo ? : ");
		int a = input.nextInt();
		
		System.out.print("Elma Kac Kilo ? : ");
		int b = input.nextInt();
		
		System.out.print("Domates Kac Kilo ? : ");
		int c = input.nextInt();
		
		System.out.print("Muz Kac Kilo ? : ");
		int d = input.nextInt();
		
		System.out.print("Patlican Kac Kilo ? : ");
		int e = input.nextInt();
		
		System.out.print("Toplam Tutar : " + ((a*2.14)+(b*3.67)+(c*1.11)+(d*0.95)+(e*5)) + " TL");
		input.close();
	}
}
