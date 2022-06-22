package Matris;

import java.util.Scanner;

public class MatrisUretme {
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Olusturmak istediginiz dizinin boyutunu giriniz : ");
		int x = inp.nextInt();
		int[] arr = new int[x];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = (int) (Math.random()*100) ;
		}
		
		for(int i : arr) {
			System.out.print(i + "\t");
		}
		
		inp.close();
	}
}
