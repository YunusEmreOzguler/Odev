package HarmonikSayi;

import java.util.Scanner;

public class HarmonikSayi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sayi;
		double toplam = 0;

    System.out.print("Sayi giriniz: ");
    sayi = input.nextInt();

    for (double i = 1; i <= sayi; i++){
    	toplam += (1/ i);
    }
    System.out.println("Girilen degere gore Harmonik Sayi = " + toplam);
	
    input.close();
	}
}
