package AsalSayi;

import java.util.Scanner;

public class AsalSayi {
	
	static void fonk(int x, int i) {
        if (x == i) {
            System.out.println(x + " asal sayidir.");
            return;
        } else if (x <= 1) {
            System.out.println(x + " asal degildir.");
            return;
        } else if (x % i == 0) {
            System.out.println(x + " asal degildir.");
            return;
        }
        fonk(x, i + 1);
    }
   
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Asalligini sorgulamak istediginiz sayiyi giriniz : ");
		int x = scan.nextInt();
		fonk(x, 2);
		scan.close();
    }
}
