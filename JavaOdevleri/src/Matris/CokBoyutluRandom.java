package Matris;

import java.util.Scanner;

public class CokBoyutluRandom {
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Olusturmak istediginiz dizinin satir sayisini giriniz : ");
		int x = inp.nextInt();
		System.out.print("Olusturmak istediginiz dizinin sutun sayisini giriniz : ");
		int y = inp.nextInt();
		
		System.out.println("=======================================================");
		int[][] arr = new int[x][y];
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j <arr[i].length ; j++) {
				arr[i][j] = (int) (Math.random()*100) ;
			}
		}
		
		for (int i=0 ; i < arr.length ; i++) {
			for(int j = 0 ; j< arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}	System.out.println();
		}
		
		inp.close();
		}
}
