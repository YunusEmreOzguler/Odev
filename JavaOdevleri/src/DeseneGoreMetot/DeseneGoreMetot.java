package DeseneGoreMetot;

import java.util.Scanner;

public class DeseneGoreMetot {
	 
	static int besCikar(int x) {
	        if(x<=0){
	            return x;
	        }else{
	            System.out.print(x+" ");
	            return besCikar(x-5);
	        }
	    }

	    static int besEkle(int x,int y) {
	        if(x>y){
	            return x;
	        }else{
	            System.out.print(x+" ");
	            return besEkle(x+5,y);
	        }
	    }

	    public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);
	        
	        System.out.println("Bir sayı giriniz : ");
	        int sayi = input.nextInt();

	        besEkle(besCikar(sayi),sayi);
	    
	        input.close();
	    }
}
