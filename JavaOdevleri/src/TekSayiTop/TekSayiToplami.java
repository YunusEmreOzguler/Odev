package TekSayiTop;

import java.util.Scanner;

public class TekSayiToplami {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter numbers : ");
		int x ,total = 0 ;

		do{
			x = input.nextInt();
			if(x%4==0) {
				total += x;
			}
			
		} while(x%2==0);
		
		System.out.println("Sum of entered values : " + total);
		
	input.close();
	}
}
