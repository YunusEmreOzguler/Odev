package MukemmelSayi;

import java.util.Scanner;

public class MukemmelSayi {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Bir sayi giriniz : ");
		
		int x = scan.nextInt();
		int sayac=0 ;
		int z=0;
		
		for(int i=1 ; i <= x ; i++) {
			int y = x%i ;
			if (y==0) {
				System.out.print(i + "\t");
				sayac++;
				z +=i;
			}
		}
		if (z==(2*x)) {
			System.out.println("Sayi mukemmel Sayidir");
		}else {
			System.out.println("Sayi mukemmel sayi degildir.");
		}
		System.out.println("\nPozitif Bolen Sayisi : " + sayac);
		
		scan.close();
	}
	
}
