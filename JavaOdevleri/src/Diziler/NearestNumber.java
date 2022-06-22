package Diziler;

import java.util.Arrays;
import java.util.Scanner;

public class NearestNumber {

		public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [] arr = {15,12,788,1,-1,-778,2,0};
		
		int min = arr[0];
        int max = arr[0];

        System.out.println(Arrays.toString(arr));
        System.out.print("Girilen Sayi : ");
        int number = scan.nextInt();

        Arrays.sort(arr);
        
        for (int i : arr) {
            if (i < number) {
                min = i;
            }
            if (i > number) {
                max = i;
                break;
            }
        }

        System.out.println("Girilen sayidan kucuk en yakin sayi : " + min);
        System.out.println("Girilen sayidan buyuk en yakin sayi : " + max);
        
        scan.close();
	}
}
 