package CinZodyagiHesaplama;

import java.util.Scanner;

public class CinZodyagiHesaplama {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		System.out.print("Dogum Yilinizi Giriniz : ");
		int year = input.nextInt();
		
		int conculation = year%12 ;
		
		if(conculation == 0) {
			
			System.out.print("Cin zodyagi burcunuz : Maymun");
		} else if(conculation == 1) {
			
			System.out.print("Cin zodyagi burcunuz : Horoz");	
		} else if(conculation == 2) {
			
			System.out.print("Cin zodyagi burcunuz : Kopek");	
		} else if(conculation == 3) {
			
			System.out.print("Cin zodyagi burcunuz : Domuz");	
		} else if(conculation == 4) {
			
			System.out.print("Cin zodyagi burcunuz : Fare");	
		} else if(conculation == 5) {
			
			System.out.print("Cin zodyagi burcunuz : Okuz");	
		} else if(conculation == 6) {
			
			System.out.print("Cin zodyagi burcunuz : Kaplan");	
		} else if(conculation == 7) {
			
			System.out.print("Cin zodyagi burcunuz : Tavsan");	
		} else if(conculation == 8) {
			
			System.out.print("Cin zodyagi burcunuz : Ejderha");	
		} else if(conculation == 9) {
			
			System.out.print("Cin zodyagi burcunuz : Yilan");	
		} else if(conculation == 10) {
			
			System.out.print("Cin zodyagi burcunuz : At");	
		} else if(conculation == 11) {
			
			System.out.print("Cin zodyagi burcunuz : Koyun");	
		} else {
			
			System.out.println("Hatali giris yaptiniz.");
		}
		
		
		
	}
	
}
