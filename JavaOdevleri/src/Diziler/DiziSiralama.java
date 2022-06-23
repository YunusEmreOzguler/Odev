package Diziler;

import java.util.Scanner;

public class DiziSiralama {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Dizinin boyutunu giriniz : ");
		int x = scan.nextInt();
		
		int gecici;
		int [] dizi = new int[x];
		
		for(int i = 0; i < x ; i++)
		{
			System.out.print("Dizinin " + (i+1) + ". elemanini giriniz: ");
			dizi[i] = scan.nextInt();
		}
		
		System.out.println("\nDizinin kucukten buyuge dogru siralanmis hali:\n");
		
		for(int i = 0; i < x; i++){
			
			for(int j = i+1; j < x; j++){
				
				if(dizi[j] <= dizi[i]) {
					
					gecici = dizi[i];
					dizi[i] = dizi[j];
					dizi[j] = gecici;
				}
			}
		}
		
		for(int i = 0; i < x; i++){
			System.out.println("Dizinin " + (i+1) + ". elemanini : " + dizi[i]);
		}
		
		
		scan.close();
	}
}
