package Kuvvet;

import java.util.Scanner;

public class RecursiveUsAlma {

	static int kuvvet(int x , int y) {
		
		if(y==1) {
			return x ;
		}
		if(y==0) {
			return 0 ;
		}
		return kuvvet(x,y-1)*kuvvet(x,1);
	}

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Taban degerini giriniz : ");
		int a = inp.nextInt();
		System.out.print("Us degerini giriniz : ");
		int b = inp.nextInt();

		System.out.println("Sonuc = " + kuvvet(a,b));
		inp.close();
	}
}
