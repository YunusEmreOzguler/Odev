package Kuvvet;

import java.util.Scanner;

public class IkininKuvvetleri {

//	Ödev
//	Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
	
	
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Bir kuvvet giriniz : ");
		
		int x = inp.nextInt();
		
		for( int i = 0 ; i<=x ; i++) {
			System.out.println("4^" + i + " = " +(int)Math.pow(4, i));
		}
		for( int j = 0 ; j<=x ; j++) {
			System.out.println("5^" + j + " = " + (int)Math.pow(5, j));
		}
		inp.close();
	}
}
