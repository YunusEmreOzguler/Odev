package BkiHesaplama;

import java.util.Scanner;

	public class BkiHesaplama{
 
		public static void main(String []argh){
	    	Scanner input = new Scanner(System.in);
	    	
			System.out.print("Boyunuzu metre cinsinden giriniz = ");
			double boy = input.nextDouble();
		
			System.out.print("Kilonuzu giriniz = ");
			double kilo = input.nextDouble();
		
			double bki = kilo/(Math.pow(boy, 2));
			System.out.println("Beden Kitle indeksiniz : " + bki);
		
		input.close();

        }
	}




	
	
