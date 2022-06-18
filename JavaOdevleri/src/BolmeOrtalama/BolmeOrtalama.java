package BolmeOrtalama;

import java.util.Scanner;

public class BolmeOrtalama {
	
	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int x = input.nextInt();
		
		int counter = 0 , total = 0;
		
		for (int i=1 ; i<=x ; i++) {
			if(i%3 == 0 && i%4 == 0) {
				total += i ;
				counter++;
			}
		}
		
		double average = (double)total/counter;
		System.out.print("Average = "+ average);
		
		input.close();
	}
}
