package EbobEkok;

import java.util.Scanner;

public class EbobEkok {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int ebob = 0;
		
		System.out.print("Birinci sayiyi giriniz = ");
		
			int a = scan.nextInt();
	
		System.out.print("Ikinci sayiyi giriniz = ");
	
			int b = scan.nextInt();
	
		for( int i=1; i<=a && i<=b ; i++) {
			
			if (a%i==0 && b%i==0) {
			ebob = i ;
			}
		}
		int ekok = (a*b)/ebob ;
		
		System.out.println("Ebob = " + ebob);
		System.out.println("Ekok = " + ekok);
	
		scan.close();
	}
}
