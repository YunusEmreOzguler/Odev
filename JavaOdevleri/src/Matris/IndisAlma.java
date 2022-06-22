package Matris;

import java.util.Scanner;

public class IndisAlma {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Matrisin satir sayisini giriniz : ");
		int x = input.nextInt();
		System.out.print("Matrisin sutun sayisini giriniz : ");
		int y = input.nextInt();
		
		int [][] matrix = new int[x][y];
		
		System.out.println("Girmeniz gereken degerler " + matrix.length + " satir ve "
                + matrix[0].length + " sutun: ");
		for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
                } 
            }
		for (int i=0 ; i < matrix.length ; i++) {
			for(int j = 0 ; j<matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}	System.out.println();
		}
		
		
		input.close();
	}
	
}
