package SayiSiralama;

import java.util.Arrays;
import java.util.Scanner;

public class SayiSiralama {

	/*
	  Ödev - Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
	 */
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int [] dizi = new int[3];
		
		System.out.println("Siralanmasini istediginiz sayilari giriniz : ");
		
		for(int i = 0 ; i<3 ; i++) { 
			int sayi = input.nextInt();
			dizi[i] = sayi ;
		}
		
		Arrays.sort(dizi);
		System.out.println("Girilen sayilarin siralanmasi : ");
		System.out.println(dizi[0] + "<" + dizi[1] + "<" + dizi[2] );
	
		input.close();
	}
}
