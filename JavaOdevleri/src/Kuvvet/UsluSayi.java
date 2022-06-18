package Kuvvet;

import java.util.Scanner;

public class UsluSayi {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Taban giriniz :");
		int x = inp.nextInt();
		
		System.out.print("Kuvvet giriniz :");
		int y = inp.nextInt();
		
		int sonuc=1 ;
		for(int i = 1 ; i <= y ; i++ ) {
			sonuc *= x;
		}
		System.out.println("Sonuc = " + sonuc);
		inp.close();
	}
}
