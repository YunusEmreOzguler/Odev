package Diziler;

import java.util.Scanner;

public class Transpoz {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Dizinin Satir Sayisini Giriniz :");
		int A = input.nextInt();
		
		System.out.print("Dizinin Sutun Sayisini Giriniz :");
		int B = input.nextInt();
		
		int[][] matrix = new int[A][B];
		
		for(int i = 0 ; i<matrix.length ; i++) {
			
			for(int j = 0 ; j<matrix[i].length ; j++) {
				
				System.out.print("Dizinin " + (i+1) + ". satir " + (j+1) + ".sutun degeri :");
				
				matrix[i][j] = input.nextInt();
			}
		}
		
		int [][] matrixTranspoze = new int[B][A];
		
		for(int k = 0 ; k < matrix.length ; k++) {
			
			for (int n = 0 ; n < matrix[k].length ; n++) {
				
				matrixTranspoze[n][k] = matrix[k][n];
			}
		}
		
		System.out.println("Matris :");
		
		for (int i=0 ; i < matrix.length ; i++) {
			
			for(int j = 0 ; j<matrix[i].length; j++) {
				
				System.out.print(matrix[i][j] + "\t");
			}	
			System.out.println();
		}
		
		System.out.println("Matris Transpozu :");
		
		for (int i=0 ; i < matrixTranspoze.length ; i++) {
			
			for(int j = 0 ; j<matrixTranspoze[i].length; j++) {
				
				System.out.print(matrixTranspoze[i][j] + "\t");
			}	
			System.out.println();
		}
		
		input.close();
	}
	
}
