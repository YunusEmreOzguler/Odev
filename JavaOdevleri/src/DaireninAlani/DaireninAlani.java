package DaireninAlani;

import java.util.Scanner;

public class DaireninAlani {

	/*  Ödev
	Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

	𝜋 sayısını = 3.14 alınız.

	Formül : (𝜋 * (r*r) * 𝛼) / 360  */
	
	
	
	public static void main(String[] args) {
		
		double 𝜋 = 3.14 ;
		Scanner input = new Scanner(System.in);
		System.out.println("Dairenin alanini ve cevresini bulmak icin istenen degerleri giriniz.  ");
		
		System.out.print("Dairenin yaricapi = ");
		int r = input.nextInt();
		
		System.out.print("Bulunmak istenen dilimin derece cinsinden acisini yaziniz. (Eger tamamini bulmak istiyorsaniz 360 giriniz.) = ");
		int 𝛼 = input.nextInt();
		
		double alan = (𝜋 *(r*r)* 𝛼) / 360;
		System.out.print("Girilen verilere gore dairenin alani : " + alan + " br^2");
		
		double cevre = (2*𝜋*r)* 𝛼/360;
		System.out.print("\nGirilen verilere gore dairenin yay uzunlugu : " + cevre + " br");
		
		input.close();
	}
}
